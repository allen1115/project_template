<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk">
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <title>Attendance Check</title>
</head>
<body>
<div class="login-form">
    <div class="top-login">
        <span><img src="images/group.png" alt=""/></span>
    </div>
    <h1>Student Attendance Check System</h1>
    <div class="login-top">
        <form action="/user/login" method="post">
            <div class="login-ic">
                <i ></i>
                <input type="text"  id="username" name="username" value="Please enter you username" autocomplete="off" onFocus="this.value = '';"/>
                <div class="clear"> </div>
            </div>
            <div class="login-ic">
                <i class="icon"></i>
                <input type="password" id="password" name="password" onFocus="this.value = '';"/>
                <div class="clear"> </div>
            </div>

            <div class="log-bwn">
                <input type="submit"  value="Login" >
                <input type="button" id="add-user" value="add" >
            </div>
        </form>
    </div>
</div>
<!--header start here-->

</body>
<script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="js/login.js" type="text/javascript"></script>
</html>
