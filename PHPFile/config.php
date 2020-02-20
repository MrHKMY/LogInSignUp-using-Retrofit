<?php
$host="localhost";
$username="root";
$password="";
$db = "LoginTry";
 
$con = mysqli_connect($host,$username,$password,$db);
 
// Check connection
if (mysqli_connect_errno())
  {
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
  }else{  //echo "Connect"; 
  
   
   }
 
?>