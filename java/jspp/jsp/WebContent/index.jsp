<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

</head>
<body>
<h1>Add New Employee</h1>
<form name="Details" id="form-1" method="post" action="controller.view">

  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="colFormLabel" name="name">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="colFormLabel" name="email">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="colFormLabel" name="password" >
    </div>
  </div>
  
  <div class="form-group row">
  <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">Country</label>

<div class="col-sm-10">
     <select id="inputState" class="form-control" id="colFormLabel" name="country">
        <option value="unknown">Select</option>
        <option value="India">India</option>
        <option value="UK">UK</option>
        <option value="China">China</option>
        <option value="America">America</option>
      </select>
    </div>
      
    </div>
  <button type="submit" class="btn btn-primary">Add</button>


</form>
<a href='login.view'>LIST


</body>
</html>