<%-- 
    Document   : AddProduct
    Created on : Apr 3, 2024, 3:42:15 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Product</title>
    </head>
    <body>
        <h1>Add New Product</h1>
        <form action="AddProduct.jsp" method="post">
            <table>
                <tr>
                    <td>Product NO: </td>
                    <td>
                        <div/> Number </div>
                    </td>
                </tr>
                <tr>
                    <td>Product Name: </td>
                    <td><input type="text" name="name" /></td>
                </tr>
                <tr>
                    <td>Quantity:</td>
                    <td>
                        <input type="integer" name="quantity" /></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" name="price" /></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><input type="text" name="Description" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Add Product" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
