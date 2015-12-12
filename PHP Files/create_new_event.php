<?php
//ek327app.comlu.com is our domain name
    $con=mysqli_connect("server38.000webhost.com","a5049086_hutt", "puppy0306", "a5049086_events");
    $event_name = $_POST["event_name"];
    $ID = $_POST["ID"];
    $time = $_POST["time"];
    $location = $_POST["location"];
    $description = $_POST["description"];
    $organizer = $_POST["organizer"];

    
    $statement = mysqli_prepare($con, "INSERT INTO Event (event_name, ID, time, location, description, organizer) VALUES (?, ?, ?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $event_name, $ID, $time, $location, $description, $organizer);
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_close($statement);
    
    mysqli_close($con);
?>					