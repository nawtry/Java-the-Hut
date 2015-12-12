<?php
    
    //ek327app.comlu.com is our domain name
    $con=mysqli_connect("localhost","a5049086_hutt", "puppy0306", "a5049086_events");
    
    $statement = mysqli_prepare($con, "SELECT *");
    mysqli_stmt_bind_param($statement, "ss");
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $event_name, $ID, $time, $location, $description, $organizer);
    
    $event = array();
    
    while(mysqli_stmt_fetch($statement)){
        $event["event_name"] = $event_name;
        $event["time"] = $time;
        $event["location"] = $location;
        $event["description"] = $description;
        $event["organizer"] = $organizer;

    }
    
    echo json_encode($eventr);
    mysqli_close($con);
?>	