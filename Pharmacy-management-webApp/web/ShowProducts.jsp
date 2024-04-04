<%-- 
    Document   : ShowProducts
    Created on : Apr 4, 2024, 1:54:06 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <head>
        <title>User Management Application</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>

    <body>

        <header>
            <nav class="navbar navbar-expand-md navbar-dark" style="background-color: green">


                <ul class="navbar-nav">
                    <li><a href="" class="nav-link">All Users</a></li>
                </ul>
            </nav>
        </header>
        <br>

        <div class="row">
            <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

            <div class="container">
                <h3 class="text-center">List of Users</h3>
                <hr>
                <div class="container text-left">

                    <a href="" class="btn btn-success">Add
                        New User</a>
                </div>
                <br>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Qte</th>
                            <th>Price</th>
                            <th>Description</th>
                            <th>Actions</th>

                        </tr>
                    </thead>
                    <tbody>
                        <!--   for (Todo todo: todos) {  -->

                        <tr>
                            <td>
                                <span value="" />
                            </td>
                            <td>
                                <span value="" />
                            </td>
                            <td>
                                <span value="" />
                            </td>
                            <td>
                                <span value="" />
                            </td>
                            <td>
                                <span value="" />
                            </td>
                            <td>
                                <a href="" class="btn btn-warning">Edit</a> &nbsp;&nbsp;
                                <a href="" class="btn btn-danger">Delete</a>
                            </td>
                        </tr>
                        <!-- } -->
                    </tbody>

                </table>
            </div>
        </div>
    </body>

</html>