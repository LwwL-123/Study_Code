<?php
$servername = "47.116.70.98";
$username = "root";
$password = "lzw980618";

try {
    $conn = new PDO("mysql:host=$servername;dbname=emailmarket;port=3306", $username, $password);
    echo "连接成功";
}
catch(PDOException $e)
{
    echo $e->getMessage();
}
?>