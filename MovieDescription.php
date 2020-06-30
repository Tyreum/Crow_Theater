<?php

$user_name = "root";
$password = "";
$host = "localhost";
$db_name = "dbCrowTheater";

$con = mysqli_connect($host,$user_name,$password,$db_name);

$sql = "select * from tbMovies;";

$result = mysqli_query($con,$sql);

$response = array();

while ($row = mysqli_fetch_array($result)) {
	array_push($response, array("Nome"=>$row["nome"],"Descricao"=>$row["descricao"],"Grade"=>$row["grade"]));
}
	echo json_encode($response);
?>