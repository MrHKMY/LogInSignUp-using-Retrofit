<?php
 
   if($_SERVER['REQUEST_METHOD']=='POST'){
  // echo $_SERVER["DOCUMENT_ROOT"]; 
//including the database connection file
       include_once("config.php");
       
        $name = $_POST['name'];
 	$username = $_POST['username'];
 	$password = $_POST['password'];
  
	 if($name == '' || $username == '' || $password == ''){
	        echo json_encode(array( "status" => "false","message" => "Parameter missing!") );
	 }else{
			 
	        $query= "SELECT * FROM registerdemo WHERE username='$username'";
	        $result= mysqli_query($con, $query);
		 
	        if(mysqli_num_rows($result) > 0){  
	           echo json_encode(array( "status" => "false","message" => "Username already exist!") );
	        }else{ 
		 	 $query = "INSERT INTO registerdemo (name,username,password) VALUES ('$name','$username','$password')";
			 if(mysqli_query($con,$query)){
			    
			     $query= "SELECT * FROM registerdemo WHERE username='$username'";
	                     $result= mysqli_query($con, $query);
		             $emparray = array();
	                     if(mysqli_num_rows($result) > 0){  
	                     while ($row = mysqli_fetch_assoc($result)) {
                                     $emparray[] = $row;
                                   }
	                     }
			    echo json_encode(array( "status" => "true","message" => "Successfully registered!" , "data" => $emparray) );
		 	 }else{
		 		 echo json_encode(array( "status" => "false","message" => "Error occured, please try again!") );
		 	}
	    }
	            mysqli_close($con);
	 }
     } else{
			echo json_encode(array( "status" => "false","message" => "Error occured, please try again!") );
	}
 
 ?>