<?php

if($_GET['type']==1)
{

    $name=$_GET['name'];
    $phone=$_GET['phone'];
    $email=$_GET['email'];
    $pass=$_GET['password'];

    include "db.php";

    $result=mysqli_query($conn,"insert into users (name,phone,email,password) values ('$name','$phone','$email','$pass')");
    if($result)
        echo "0";else echo "-1";
}
if($_GET['type']==2)
{
    $email=$_GET['email'];
    $pass=$_GET['password'];

    include "db.php";
    $result=mysqli_query($conn,"select * from users where email='$email' and password='$pass' ");
    if(mysqli_num_rows($result)>0)
        echo "0";else echo "-1";
}



if($_GET['type']==3)
{
    $msg=$_GET['msg'];

    include "db.php";

    $result=mysqli_query($conn,"insert into data (msg,date) values ('$msg',now())");
    if($result)
    echo "0";else echo "-1";

}

if($_GET['type']==4)
{
    $date=$_GET['date'];


    include "db.php";
    $result=mysqli_query($conn,"select * from data where date='$date' ");
    $a=array();
    while ($row=mysqli_fetch_assoc($result))
    {
        array_push($a,$row);
    }
    echo json_encode($a);
}

?>
