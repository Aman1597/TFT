<%-- 
    Document   : login
    Created on : 28 Mar, 2019, 7:01:12 PM
    Author     : Aman Deep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
     <meta name="viewport" content="width=device-width , initial-scale=1.0, user-scalable=yes">
     <meta http-equiv="X-UA-Compatible" content="IE-edge">
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>Login Page</title>
  <style>
    body{ background: url("image/back.png"); background-size: 100% 100vh;
          display: flex;
          align-items:center;
          justify-content: space-around;
          flex-direction: column;
          min-height: 97.6vh;
    }
    form{
        width: 23.75%;
    }
    .ttt
    {
        width: 100%;//23.75%;//320px;
        //height: 50%;
        //margin: 0 auto;
        background: white;//black;
        color: black;//white;
        font-family: sans-serif;
        box-shadow:2px 4px 7px gray , -2px 4px 7px gray;
    }
    .ttt:hover
    {
        box-shadow:4.5px 5px 20px rgba(128,128,128,0.5) , -4.5px 5px 20px rgba(128,128,128,0.5) , 3px 4px 25px gray , -3px 4px 25px gray;
    }
    .ttt td
    {
        padding-top: 0px;
        padding-bottom: 5px;
        padding-left: 30px;
        padding-right: 30px;
        font-weight: bold;
        font-size: 17.5px;
    }
    .ttt input
    {
        height: 40px;
        font-size: 16px;
        width: 100%;
        outline: none;
        margin-bottom: 20px;
    }
    .logini
    {
        background: transparent;
        border-left: none;
        border-top: none;
        border-right: none;
        border-bottom: 2px solid black;//white;
        color: #1DA1F2;
    }
    .logini:focus
    {
        border-left: none;
        border-top: none;
        border-right: none;
        //border-bottom: 2px solid white;
        border-bottom-color: red;
        transition: border-bottom-color 2s;
        //transition-timing-function: ease-in-out;
    }
    .avatar
    {   
        width: 100px;
        height: 100px;
        border-radius: 50%;
        //margin: auto; //position: absolute;
        margin-top: -55px;//top: -40px;//-50px;
        //margin-left: 73px;//left:100px;
    }
    .ttt input[type="submit"]
    {
        border: none;
        color:white;//black;
        background: red;
        border-radius: 20px;
        font-size: 18px;
    }
    
    .ttt input[type="submit"]:hover
    {
        cursor: pointer;
        color: red;
        background: lightblue;
    } 
    @media screen and (max-width: 1050px) {
        form {
            width: 40%;
        }
    }
    @media screen and (max-width: 650px) {
        form {
            width: 100%;
        }
    }
    
    h1{
        margin-top: 0;
    }
  </style>
 </head>
    <body>
    
     <h1>Only For Admin</h1>
     <form action="codes/logincode.jsp" method="post">
      <table border="0" class="ttt" style="border: 1px solid silver;">
          <tr><td style="text-align:center;"><img src="image/avatar.png" class="avatar"/></td></tr>
        <tr>
            <td style="text-align: center;font-size: 22px;padding-top: 6px;padding-bottom: 20px;">LOGIN HERE</td>
        </tr>
        <tr>
            <td>Admin ID</td>
        </tr>
        <tr>
            <td><input class="logini" type="text" name="id" required="" placeholder="Enter ID"/></td>
        </tr>
        <tr>
            <td>Password</td>
        </tr>
        <tr>
            <td><input class="logini" type="password" name="password" required="" placeholder="Enter Password"/></td>
        </tr>
        <tr>
            <td style="padding-bottom: 30px;padding-top: 20px;"><input type="submit" value="Login"/></td>
        </tr>
      </table> 
     </form>
    
    </body>
</html>
