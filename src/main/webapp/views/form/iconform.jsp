<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Dodaj metodę</title>
</head>
<body>
<%@ include file="/views/signinheader.jsp" %><br/>

<div class="container">

<form:form modelAttribute="designMethod" enctype="multipart/form-data" method="post"  class="form-horizontal">
<fieldset>
<form:errors path="*"></form:errors>
<!-- Form Name -->
<legend>Tworzenie metody projektowej</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Nazwa Metody</label>  
  <div class="col-md-4">
  <form:input id="textinput" path="name" class="form-control input-md"/>  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Krótki opis</label>  
  <div class="col-md-4">
  <form:input id="textinput" path="short_description" class="form-control input-md"/> 
  </div>
</div>

<!-- Textarea ma być automagicznie uzupełniana lista podpuntów-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textarea">Założenia</label>
  <div class="col-md-4">                     
    <form:textarea class="form-control" id="textarea" path="assumptions"/>
  </div>
</div>

<!-- Textarea ma być automagicznie uzupełniana lista podpuntów -->
<div class="form-group">
  <label class="col-md-4 control-label" for="textarea">Zasady</label>
  <div class="col-md-4">                     
    <form:textarea class="form-control" id="textarea" path="rules"/>
  </div>
</div>

<!-- Textarea ma być automagicznie uzupełniana lista podpuntów-->
<div class="form-group">
  <label class="col-md-4 control-label" for="textarea">Problemy</label>
  <div class="col-md-4">                     
    <form:textarea class="form-control" id="textarea" path="problems"/>
  </div>
</div>

<!-- File Button --> 
<%-- <div class="form-group">
  <label class="col-md-4 control-label" for="filebutton">Ikona preblemów</label>
  <div class="col-md-4">
    <form:input id="filebutton" path="problems_icon" class="input-file" type="file"/>
  </div>
</div> --%>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="selectbasic">Etap</label>
  <div class="col-md-4">
    <form:select id="selectbasic" items="${stages}" path="stages"  class="form-control"/>
  </div>
</div>

<!-- File Button --> 
<%-- <div class="form-group">
  <label class="col-md-4 control-label" for="filebutton">Ikona etapu</label>
  <div class="col-md-4">
    <form:input id="filebutton" path="stages_icon" class="input-file" type="file"/>
  </div>
</div> --%>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="selectbasic">Ilość uczestników</label>
  <div class="col-md-4">
    <form:select id="selectbasic" path="number_of_participants" items="${numberOfParticipants}" class="form-control"/>
  </div>
</div>

<!-- Multiple Radios (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="radios">Poziom trudności</label>
  <div class="col-md-4"> 
 	 Łatwy
    <label class="radio-inline" for="radios-0">
      <form:radiobutton path="difficulty" id="radios-0a" value="1" />
      1
    </label> 
    <label class="radio-inline" for="radios-1">
      <form:radiobutton path="difficulty" id="radios-1a" value="2" checked="checked"/>
      2
    </label> 
    <label class="radio-inline" for="radios-2">
      <form:radiobutton path="difficulty" id="radios-2a" value="3"/>
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
      <form:radiobutton path="detail_level" id="radios-0b" value="1"/>
      1
    </label> 
    <label class="radio-inline" for="radios-1">
      <form:radiobutton path="detail_level" id="radios-1b" value="2" checked="checked"/>
      2
    </label> 
    <label class="radio-inline" for="radios-2">
      <form:radiobutton path="detail_level" id="radios-2b" value="3"/>
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
      <form:radiobutton path="advancement_level" id="radios-0c" value="1"/>
      1
    </label> 
    <label class="radio-inline" for="radios-1">
      <form:radiobutton path="advancement_level" id="radios-1c" value="2" checked="checked"/>
      2
    </label> 
    <label class="radio-inline" for="radios-2">
      <form:radiobutton path="advancement_level" id="radios-2c" value="3"/>
      3
    </label>
    Profesjonaliści
  </div>
</div>

<!-- Multiple Radios (inline) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="radios">Interakcje</label>
  <div class="col-md-4"> 
  	Swobodne
    <label class="radio-inline" for="radios-0">
      <form:radiobutton path="freedom_level" id="radios-0d" value="1"/>
      1
    </label> 
    <label class="radio-inline" for="radios-1">
      <form:radiobutton path="freedom_level" id="radios-1d" value="2" checked="checked"/>
      2
    </label> 
    <label class="radio-inline" for="radios-2">
      <form:radiobutton path="freedom_level" id="radios-2d" value="3"/>
      3
    </label>
    Profesjonalne
  </div>
</div>

<!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="filebutton">Ikona metody</label>
  <div class="col-md-4">
    <input id="filebutton" name="icon" class="input-file" type="file"/>
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
</form:form>


</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<%@ include file="/views/magicfooter.jsp" %><br/>
</body>
</html>