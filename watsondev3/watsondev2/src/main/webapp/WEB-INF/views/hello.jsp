<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type = "text/javascript">
$(document).ready(function(){
	$('#speak').click(function(){
		$('#myaudio').stop();
		$('#myaudio').attr('src','../Speaker?&'+$('#myform').serialize());
		$('#myaudio').attr('autoplay','autoplay');
	});
});
</script>
<link rel= "Shortcut icon" href="/favicon.ico"/>
</head>
<body>
<form id="myform" method = "post">
text2speech sample example<br/>
<textarea rows= "7" cols="40" name="statement">
The club isn't the best place to find a lover
So the bar is where I go 
Me and my friends at the table doing shots
Drinking fast and then we talk slow 
And you come over and start up a conversation with just me
And trust me I'll give it a chance now 
Take my hand, stop, put Van The Man on the jukebox
And then we start to dance
And now I'm singing like

Girl, you know I want your love
Your love was handmade for somebody like me
Come on now, follow my lead
I may be crazy, don't mind me
Say, boy, let's not talk too much
Grab on my waist and put that body on me
Come on now, follow my lead
Come, come on now, follow my lead 

I'm in love with the shape of you
We push and pull like a magnet do
Although my heart is falling too
I'm in love with your body
Last night you were in my room
And now my bedsheets smell like you
Every day discovering something brand new
I'm in love with your body

Oh I oh I oh I oh I
I'm in love with your body
Oh I oh I oh I oh I
I'm in love with your body
Oh I oh I oh I oh I
I'm in love with your body
Every day discovering something brand new
I'm in love with the shape of you

One week in we let the story begin
We're going out on our first date 
You and me are thrifty, so go all you can eat
Fill up your bag and I fill up a plate 
We talk for hours and hours about the sweet and the sour
And how your family is doing okay (mmmm)
And leave and get in a taxi, then kiss in the backseat
Tell the driver make the radio play
And I'm singing like

Girl, you know I want your love
Your love was handmade for somebody like me
Come on now, follow my lead
I may be crazy, don't mind me
Say, boy, let's not talk too much
Grab on my waist and put that body on me
Come on now, follow my lead
Come, come on now, follow my lead (mmmm)

I'm in love with the shape of you
We push and pull like a magnet do
Although my heart is falling too
I'm in love with your body
Last night you were in my room
And now my bedsheets smell like you
Every day discovering something brand new
I'm in love with your body

Oh I oh I oh I oh I
I'm in love with your body
Oh I oh I oh I oh I
I'm in love with your body
Oh I oh I oh I oh I
I'm in love with your body
Every day discovering something brand new
I'm in love with the shape of you

Come on, be my baby, come on
Come on, be my baby, come on
Come on, be my baby, come on
Come on, be my baby, come on
Come on, be my baby, come on
Come on, be my baby, come on
Come on, be my baby, come on
Come on, be my baby, come on

I'm in love with the shape of you
We push and pull like a magnet do
Although my heart is falling too
I'm in love with your body
Last night you were in my room
And now my bedsheets smell like you
Every day discovering something brand new
I'm in love with your body

Come on, be my baby, come on
Come on, be my baby, come on
I'm in love with your body
Come on, be my baby, come on
Come on, be my baby, come on
I'm in love with your body
Come on, be my baby, come on
Come on, be my baby, come on
I'm in love with your body
Every day discovering something brand new
I'm in love with the shape of you
</textarea><br/>

<select name="voice">

${msg}<br/>
<c:forEach items="${voices}" var="voice">
${voice.description}<br/>
<option>${voice.language} : ${voice.description}</option>
</c:forEach>
</select><br/>
<input type="button" id="speak" value="읽기"><br/>
<audio id="myaudio" controls="controls"  preload="auto" />
</form>
</body>
</html>