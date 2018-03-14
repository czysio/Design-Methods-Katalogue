<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Dodaj metodę</title>
</head>
<body>
<%@ include file="/WEB-INF/views/formheader.jsp" %><br/>

<div class="container">

<form:form modelAttribute="icon" method="post"  class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Tworzenie metody projektowej</legend>

<!-- Textarea -->
<div class="form-group">
  <label class="col-md-4 control-label" for="textarea">Założenia</label>
  <div class="col-md-4">                     
    <form:textarea class="form-control" id="textarea" path="assumptions"/>tekst
  </div>
</div>

<!-- Textarea -->
<div class="form-group">
  <label class="col-md-4 control-label" for="textarea">Zasady</label>
  <div class="col-md-4">                     
    <form:textarea class="form-control" id="textarea" path="rules"/>tekst
  </div>
</div>

<!-- Textarea -->
<div class="form-group">
  <label class="col-md-4 control-label" for="textarea">Problemy</label>
  <div class="col-md-4">                     
    <form:textarea class="form-control" id="textarea" path="problems"/>tekst
  </div>
</div>

<!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="filebutton">Ikona preblemów</label>
  <div class="col-md-4">
    <form:input id="filebutton" path="problems_icon" class="input-file" type="file">
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="selectbasic">Etap</label>
  <div class="col-md-4">
    <select id="selectbasic" name="selectbasic" class="form-control">
      <option value="1">Option one</option>
      <option value="2">Option two</option>
    </select>
  </div>
</div>

<!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="filebutton">Ikona etapu</label>
  <div class="col-md-4">
    <input id="filebutton" name="filebutton" class="input-file" type="file">
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="selectbasic">Ilość uczestników</label>
  <div class="col-md-4">
    <select id="selectbasic" name="selectbasic" class="form-control">
      <option value="1">Option one</option>
      <option value="2">Option two</option>
    </select>
  </div>
</div>

<!-- Multiple Radios (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="radios">Poziom trudności</label>
  <div class="col-md-4"> 
 	 Łatwy
    <label class="radio-inline" for="radios-0">
      <input name="radios" id="radios-0a" value="1" type="radio">
      1
    </label> 
    <label class="radio-inline" for="radios-1">
      <input name="radios" id="radios-1a" value="2" checked="checked" type="radio">
      2
    </label> 
    <label class="radio-inline" for="radios-2">
      <input name="radios" id="radios-2a" value="3" type="radio">
      3
    </label>
    Trudny
  </div>
</div>

<!-- Multiple Radios (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="radios">Poziom szczegółowości</label>
  <div class="col-md-4"> 
  	Niski
    <label class="radio-inline" for="radios-0">
      <input name="radios" id="radios-0b" value="1" type="radio">
      1
    </label> 
    <label class="radio-inline" for="radios-1">
      <input name="radios" id="radios-1b" value="2" checked="checked" type="radio">
      2
    </label> 
    <label class="radio-inline" for="radios-2">
      <input name="radios" id="radios-2b" value="3" type="radio">
      3
    </label>
    Wysoki
  </div>
</div>

<!-- Multiple Radios (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="radios">Poziom zaawansowania uczesników</label>
  <div class="col-md-4"> 
  	Amatorzy
    <label class="radio-inline" for="radios-0">
      <input name="radios" id="radios-0c" value="1"  type="radio">
      1
    </label> 
    <label class="radio-inline" for="radios-1">
      <input name="radios" id="radios-1c" value="2" checked="checked" type="radio">
      2
    </label> 
    <label class="radio-inline" for="radios-2">
      <input name="radios" id="radios-2c" value="3" type="radio">
      3
    </label>
    Profesjonaliści
  </div>
</div>

<!-- Multiple Radios (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="radios">Swoboda</label>
  <div class="col-md-4"> 
  	Brak swobody
    <label class="radio-inline" for="radios-0">
      <input name="radios" id="radios-0d" value="1" type="radio">
      1
    </label> 
    <label class="radio-inline" for="radios-1">
      <input name="radios" id="radios-1d" value="2" checked="checked" type="radio">
      2
    </label> 
    <label class="radio-inline" for="radios-2">
      <input name="radios" id="radios-2d" value="3" type="radio">
      3
    </label>
    Pełna swoboda
  </div>
</div>

<!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="filebutton">Icona metody</label>
  <div class="col-md-4">
    <input id="filebutton" name="filebutton" class="input-file" type="file">
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-dark">Wysyłam do weryfikacji</button>
  </div>
</div>

</fieldset>
</form>


</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>