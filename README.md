# "Rina Karim" website

The “Rina Karim” Fitness Coach website is a model of modern fitness coach peofile. This model shows how Fitness Coach website enables the clients to perform the essential keeping trainings and other workouts. The system provides the access to the client to order a personal training, nutrition plan from website and also to see some news in the website. In this extend, we appear how clients works with fitness coach via website. The purpose of our project is to show how “Rina Karim” Fitness Coach website is working.


## main.html:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel = "stylesheet" type="text/css" href="first.css">
    <title>Fit-coach</title>
   </head>   
<header>
<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <div class="container-fluid">
    <a class="navbar-brand" href="#">Rina Karim</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#">HOME
                <span class="sr-only">(current)</span>
              </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="about.html" target="_blank">ABOUT US</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="services.html" target="_blank">SERVICES</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="nutrition.html" target="_blank">NUTRITION</a>
        </li>
          <li class="nav-item">
          <a class="nav-link" href="calculation.html" target="_blank">CALCULATION</a>
        </li>
      </ul>
    </div>
    </div>
</nav>

    
  <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
      <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
      <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
      
      <div class="carousel-item active" style="background-image: url('img/second.jpg')">
        <div class="carousel-caption d-none d-md-block">
          <h2 class="display-4">Welcome to Rina Karim!</h2>
          <p class="lead">Find your own way here</p>
        </div>
      </div>
   
      <div class="carousel-item" style="background-image: url('img/fourth.jpg')">
        <div class="carousel-caption d-none d-md-block">
          <h2 class="display-4">Fitness solution for Busy People</h2>
          <p class="lead">Be stronger than your execuses</p>
        </div>
      </div>
      
      <div class="carousel-item" style="background-image: url('img/third.jpg')">
        <div class="carousel-caption d-none d-md-block">
          <h2 class="display-4">Calculate your calories</h2>
          <p class="lead">You can use our calculator</p>
        </div>
      </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
  </div>
</header>
     <section class="home-about spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <div class="about-text">
                        <h2>WELCOME TO RINA KARIM</h2>
                        <p class="short-details">Rina Karim's personal program</p>
                        <p class="long-details">The goal of this program is to help people to develop their athletic position through personal training.  These workouts have been developed by our experienced trainers.</p>
                        <a href="#" class="primary-btn about-btn">Read More</a>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="about-img">
                        <img src="img/RK.png" alt="rk">
                    </div>
                </div>
            </div>
        </div>
    </section>
<!-- About Section Begin -->
    
    <section class="feature-section">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4">
                    <div class="feature-item set-bg">
                        <div class ="first-photo">
                        <h3>CLASSES</h3>
                        <p>Our program have various classes<br /> (group and personal)</p>
                        <a href="services.html" class="primary-btn f-btn">Read More</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="feature-item set-bg">
                        <div class ="second-photo">
                        <h3>TRAININGS</h3>
                        <p>Personal training implies a personalized approach <br /> </p>
                        <a href="services.html" class="primary-btn f-btn">Read More</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="feature-item set-bg">
                        <div class ="third-photo">
                        <h3>NUTRITION</h3>
                        <p>Every training should include<br /> proper  program nutrition</p>
                        <a href="nutrition.html" class="primary-btn f-btn">Read More</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Feature Section End -->
<section class="classes-section">
        <div class="class-title set-bg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-7 m-auto text-center">
                        <div class="section-title pl-lg-4 pr-lg-4 pl-0 pr-0">
                            <h2>Choose Your Program</h2>
                            <p>Our trainers can help you to find your own way. Every program includes personal and group workouts.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-3 col-sm-6">
                    <div class="classes-item set-bg">
                        <h4>CROSSFIT</h4>
                        <p>This is a strength and conditioning workout that is made up of functional movement performed at a high intensity level.</p>
                        <a href="services.html" class="primary-btn class-btn">Read More</a>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class ="bootcamp">
                    <div class="classes-item set-bg">
                        <h4>BOOTCAMP</h4>
                        <p>Type of group physical training programme conducted by gyms, personal trainers and former military personnel.
                        </p>
                        <a href="services.html" class="primary-btn class-btn">Read More</a>
                    </div>
                </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class="classes-item set-bg">
                        <h4>GRAVITY</h4>
                        <p>It's a full-body strength workout in a semi-private setting - think modified personal training at a fraction of the cost.</p>
                        <a href="services.html" class="primary-btn class-btn">Read More</a>
                    </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class ="balance">
                    <div class="classes-item set-bg">
                        <h4>BALANCE</h4>
                        <p>This is a unique workout which incorporates Yoga to help improve flexibility, build strength and leave you feeling relaxed and calm.</p>
                        <a href="services.html" class="primary-btn class-btn">Read More</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<div class="map">
       <iframe src="https://maps.google.com/maps?width=100%25&amp;height=580&amp;hl=en&amp;q=Nur-Sultan,%20Kazakhstan,%20Nazhimedenova%2014+(Rina%20Karim)&amp;t=&amp;z=14&amp;ie=UTF8&amp;iwloc=B&amp;output=embed"></iframe>
        <div class="map-contact-detalis">
            <div class="open-time">
                <h5>Weekday:</h5>
                <ul>
                    <li>Monday-Friday: <span>08:30 - 12:00</span></li>
                    <li>Saturday: <span>09:00 - 22:00</span></li>
                    <li>Sunday: <span>09:00 - 18:00</span></li>
                </ul>
            </div>
            <div class="map-contact-form">
                <h5>Contact Us</h5>
                <form action="#">
                    <input type="text" placeholder="Name">
                    <input type="text" class="phone" placeholder="Phone">
                    <textarea placeholder="Message"></textarea>
                    <button type="submit" class="site-btn">Send </button>
                </form>
            </div>
        </div>
    </div>
<head>
  <title>Footer</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">
</head>
<footer class="container-fluid bg-grey py-5">
<div class="container">
   <div class="row">
      <div class="col-md-6">
         <div class="row">
            <div class="col-md-6">
               <div class="logo-part">
                  <img src="img/RK.png" class="w-50 logo-footer" >
                  <p>Location: </p>
                  <p>Kazakhstan, Nur-Sultan</p>
               </div>
            </div>
            <div class="col-md-6 px-4">
               <h6>Rina Karim</h6>
               <p>Fitness Coach Company</p>
               <a href="#" class="btn-footer"> More Info </a><br>
               <a href="https://wa.me/87019007557" class="btn-footer"> Contact Us</a>
            </div>
         </div>
      </div>
      <div class="col-md-6">
         <div class="row">
            <div class="col-md-6 px-4">
               <h6> Help us</h6>
               <div class="row ">
                  <div class="col-md-6">
                     <ul>
                        <li> <a href="#"> Home</a> </li>
                        <li> <a href="about.html"> About</a> </li>
                        <li> <a href="services.html"> Service</a> </li>
                        <li> <a href="https://www.facebook.com/rinata.ermekbaeva"> Team</a> </li>
                        <li> <a href="https://wa.me/87019007557"> Contact</a> </li>
                     </ul>
                  </div>
               </div>
            </div>
            <div class="col-md-6 ">
               <h6>You can find us here:</h6>
               <div class="social">
                  <a href="https://www.facebook.com/rinata.ermekbaeva"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                  <a href="https://www.instagram.com/rina_fitnessforhealth/"><i class="fa fa-instagram" aria-hidden="true" ></i></a>
               </div>
            </div>
         </div>
      </div>
   </div>
</div>
</footer>
    <script src="jquery-3.6.0.min.js"></script>
</html>
```

## first.css:

```css
first.css:
.carousel-item {
  height: 100vh;
  min-height: 350px;
  background: no-repeat center center scroll;
  background-size: cover;
}

header{
  display:block;  
  background-color: #151515;
}
body {
font-family: 'Signika', sans-serif;

     }
header{
    background-size: 100%;
}
.bg-grey {
background: #292929;
     }
.map {
	height: 590px;
	position: relative;
}

.map iframe {
	width: 100%;
    height: 590px;
}

.map-contact-detalis {
	width: 420px;
	padding: 40px;
	background: #ffffff;
	position: absolute;
	right: 120px;
	top: 80px;
	-webkit-box-shadow: 6px 6px 50px rgba(198, 198, 198, 0.2);
	box-shadow: 6px 6px 50px rgba(198, 198, 198, 0.2);
}

.map-contact-detalis .open-time {
	overflow: hidden;
	margin-bottom: 10px;
}

.map-contact-detalis .open-time h5 {
	font-size: 20px;
	color: #000000;
	font-weight: 500;
	text-transform: uppercase;
	float: left;
}

.map-contact-detalis .open-time ul {
	float: right;
}

.map-contact-detalis .open-time ul li {
	font-size: 14px;
	color: #000000;
	list-style: none;
	font-weight: 600;
	line-height: 30px;
	position: relative;
	padding-right: 108px;
}

.map-contact-detalis .open-time ul li span {
	position: absolute;
	right: 0;
	top: 0;
}

.map-contact-detalis .map-contact-form h5 {
	font-size: 20px;
	color: #000000;
	font-weight: 500;
	text-transform: uppercase;
	margin-bottom: 20px;
}

.map-contact-detalis .map-contact-form form input {
	width: calc(53% - 20px);
	margin-right: 20px;
	float: left;
	height: 40px;
	margin-bottom: 20px;
	font-size: 16px;
	color: #272727;
	border: 1px solid #e1e1e1;
	padding-left: 20px;
	border-radius: 2px;
}

.map-contact-detalis .map-contact-form form input.phone {
	width: 47%;
	margin-right: 0;
}

.map-contact-detalis .map-contact-form form input::-webkit-input-placeholder {
	color: #272727;
	font-weight: 600;
}

.map-contact-detalis .map-contact-form form input::-moz-placeholder {
	color: #272727;
	font-weight: 600;
}

.map-contact-detalis .map-contact-form form input:-ms-input-placeholder {
	color: #272727;
	font-weight: 600;
}

.map-contact-detalis .map-contact-form form input::-ms-input-placeholder {
	color: #272727;
	font-weight: 600;
}

.map-contact-detalis .map-contact-form form input::placeholder {
	color: #272727;
	font-weight: 600;
}

.map-contact-detalis .map-contact-form form textarea {
	width: 100%;
	height: 80px;
	resize: none;
	font-size: 16px;
	color: #272727;
	border: 1px solid #e1e1e1;
	border-radius: 2px;
	padding-left: 20px;
	padding-top: 10px;
	margin-bottom: 18px;
}

.map-contact-detalis .map-contact-form form textarea::-webkit-input-placeholder {
	color: #272727;
	font-weight: 600;
}

.map-contact-detalis .map-contact-form form textarea::-moz-placeholder {
	color: #272727;
	font-weight: 600;
}

.map-contact-detalis .map-contact-form form textarea:-ms-input-placeholder {
	color: #272727;
	font-weight: 600;
}

.map-contact-detalis .map-contact-form form textarea::-ms-input-placeholder {
	color: #272727;
	font-weight: 600;
}

.map-contact-detalis .map-contact-form form textarea::placeholder {
	color: #272727;
	font-weight: 600;
}

.logo-footer {
 margin-bottom: 40px;
     }
footer {
background-color: #151515;
color: grey;
font-family: 'Open Sans';
     }
footer p, a {
    font-size: 12px;
    font-family: 'Open Sans', sans-serif;
}
footer h6 {
    font-family: 'Open Sans', serif;
    margin-bottom: 40px;
    position: relative;
}
footer h6:after {
    position: absolute;
    content: "";
    background: grey;
    width: 12%;
    height: 1px;
    left: 0;
    bottom: -20px;
}
.btn-footer {
    color: grey;
    text-decoration: none;
    border: 1px solid;
    border-radius: 43px;
    font-size: 13px;
    padding: 7px 30px;
    line-height: 47px;
}

.social .fa {
    color: grey;
    font-size: 22px;
    padding: 10px 15px;
    background: #3c3c3c;
}
footer ul li {
    list-style: none;
    display: block;
}
footer ul  {
   padding-left: 0;
}
footer ul  li a{
  text-decoration: none;
  color: grey;
  text-decoration:none;
}
a:hover {
    text-decoration: none;
    color: #f5f5f5;
    
}
.logo-part {
    border-right: 1px solid grey;
    height: 100%;
    }

form {
  padding-right: 20px !important;
}
form input[type=text],
form input[type=password],
form input[type=email],
form input[type=url]{
  width: 100%;
  outline: none;
  height: 40px;
  margin-bottom: 10px;
  padding-left: 15px;
  background: #fff;
  border: none;
  color: #545454;
  font-family: 'Open Sans';
  font-size: 13px;
}


.primary-btn {
	display: inline-block;
	font-size: 14px;
	font-family: "Oswald", sans-serif;
	font-weight: 600;
	padding: 0 12px;
	color: #ffdb58;
	letter-spacing: 2px;
	text-transform: uppercase;
	text-align: center;
	width: 160px;
	height: 46px;
	border-left: 2px solid #2f4f4f;
	border-right: 2px solid #2f4f4f;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
	background-position: 0 0, 0 100%;
	background-repeat: no-repeat;
	background-size: 100% 2px;
	background-image: -webkit-gradient(linear, left top, right top, color-stop(100%, #2f4f4f), to(#2f4f4f)), -webkit-gradient(linear, left top, right top, from(#2f4f4f), color-stop(0%, #2f4f4f));
	background-image: -o-linear-gradient(left, #2f4f4f 100%, #2f4f4f 100%), -o-linear-gradient(left, #2f4f4f 0%, #2f4f4f 0%);
	background-image: linear-gradient(to right, #2f4f4f 100%, #2f4f4f 100%), linear-gradient(to right, #2f4f4f 0%, #2f4f4f 0%);
	-webkit-transition-duration: 1000ms;
	-o-transition-duration: 1000ms;
	transition-duration: 1000ms;
	line-height: 45px;
	position: relative;
	z-index: 1;
	border-radius: 4px;
}

.primary-btn:after {
	color: #ffdb58;
	-webkit-transition-duration: 500ms;
	-o-transition-duration: 500ms;
	transition-duration: 500ms;
	background: #2f4f4f;
	background: -webkit-gradient(linear, left top, right top, from(#2f4f4f), to(#2f4f4f));
	background: -o-linear-gradient(left, #2f4f4f, #2f4f4f);
	background: linear-gradient(to right, #2f4f4f, #2f4f4f);
	content: "";
	position: absolute;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	z-index: -1;
	border-radius: 2px;
	opacity: 0;
}

.site-btn {
	display: inline-block;
	font-size: 12px;
	font-family: "Oswald", sans-serif;
	font-weight: 600;
	padding: 0 12px;
	color: black;
	letter-spacing: 1px;
	text-transform: uppercase;
	text-align: center;
	background: none;
	width: 127px;
	height: 40px;
	border-left: 2px solid #2f4f4f;
	border-right: 2px solid #2f4f4f;
	border-top: none;
	border-bottom: none;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
	background-position: 0 0, 0 100%;
	background-repeat: no-repeat;
	background-size: 100% 2px;
	background-image: -webkit-gradient(linear, left top, right top, color-stop(100%, #2f4f4f), color-stop(0%, #2f4f4f)), -webkit-gradient(linear, left top, right top, from(#2f4f4f), color-stop(0%, #2f4f4f));
	background-image: -o-linear-gradient(left, #2f4f4f 100%, #2f4f4f 0%), -o-linear-gradient(left, #2f4f4f 0%, #2f4f4f 0%);
	background-image: linear-gradient(to right, #2f4f4f 100%, #2f4f4f 0%), linear-gradient(to right, #2f4f4f 0%, #2f4f4f 0%);
	-webkit-transition-duration: 1000ms;
	-o-transition-duration: 1000ms;
	transition-duration: 1000ms;
	line-height: 38px;
	position: relative;
	z-index: 1;
	border-radius: 4px;
}

.site-btn:after {
	color: #fff;
	-webkit-transition-duration: 500ms;
	-o-transition-duration: 500ms;
	transition-duration: 500ms;
	background: #e16521;
	background: -webkit-gradient(linear, left top, right top, from(#2f4f4f), to(#2f4f4f));
	background: -o-linear-gradient(left, #2f4f4f, #2f4f4f);
	background: linear-gradient(to right, #2f4f4f, #2f4f4f);
	content: "";
	position: absolute;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	z-index: -1;
	border-radius: 2px;
	opacity: 0;
}
.set-bg {
	background-repeat: no-repeat;
	background-size: cover;
	background-position: top center;
}
.item {
    position: relative;
}
.item .alert {
    float: left;
    margin: 0 0 0 20px;
    padding: 3px 10px;
    color: #FFF;
    border-radius: 3px 4px 4px 3px;
    background-color: #ef3030;
    max-width: 170px;
    white-space: pre;
    position: absolute;
    left: -15px;
    opacity: 0;
    z-index: 1;
    transition: .15s ease-out;
}
.item .alert::after {
    content: '';
    display: block;
    height: 0;
    width: 0;
    border-color: transparent #ef3030 transparent transparent;
    border-style: solid;
    border-width: 11px 7px;
    position: absolute;
    top: 5px;
    left: -10px;
}
.item.bad .alert {
    left: 0;
    opacity: 1;
    top: 5px;
    left: 343px;
    font-size: 12px;
    padding: 10px;
}
.feature-item {
	text-align: center;
	height: 380px;
	margin-left: -15px;
	margin-right: -15px;
	padding: 50px 15px 15px;
	position: relative;
    background-color: #151515;
}

.first-photo{
    background-image: url("img/feature-1.jpg");
    padding-bottom: 55px;
    padding-top: 55px;
    padding-left: 55px;
    padding-right: 55px;
}
.second-photo{
    background-image: url("img/feature-2.jpg");
    padding-bottom: 55px;
    padding-top: 55px;
    padding-left: 55px;
    padding-right: 55px;
}
.third-photo{
    background-image: url("img/train2.jpg");
    padding-bottom: 55px;
    padding-top: 55px;
    padding-left: 55px;
    padding-right: 55px;
}
.feature-item:hover:before {
	opacity: 1;
}

.feature-item:before {
	position: absolute;
	left: 0;
	bottom: 0;
	width: 100%;
	height: 5px;
	background: #e4381C;
	content: "";
	opacity: 0;
	-webkit-transition: all 0.3s;
	-o-transition: all 0.3s;
	transition: all 0.3s;
}

.feature-item h3 {
	color: #ffdb58;
	font-weight: 500;
	text-transform: uppercase;
	margin-bottom: 14px;
}

.feature-item p {
	color: white;
	margin-bottom: 22px;
}

.feature-item .primary-btn.f-btn:hover:after {
	opacity: 1;
}

.home-about {
	background: #151515;
}

.about-text {
	padding-top: 38px;
    padding-bottom: 38px;
}

.about-text h2 {
	font-size: 48px;
	font-weight: 500;
	color: #ffdb58;
	text-transform: uppercase;
	margin-bottom: 36px;
}

.about-text p.short-details {
	font-size: 20px;
	font-weight: 600;
	color: #ffffff;
	line-height: 28px;
	margin-bottom: 20px;
}

.about-text p.long-details {
	color: #ffffff;
	margin-bottom: 40px;
}

.about-text .primary-btn.about-btn:after {
	opacity: 1;
}

.about-img img {
	min-width: 100%;
    width:500px;
    height: 500px;
    float: left;
    padding-bottom: 20px;
    padding-top: 20px;
    padding-left: 20px;
    padding-right: 20px;
}
.classes-section {
	background: #151515;
}

.classes-section.schedule-page .class-title {
	padding: 0;
}

.classes-section.schedule-page .class-title .section-title {
	margin-bottom: 65px;
}

.class-title {
	padding-top: 60px;
	padding-bottom: 62px;
    background-image: url(img/thin-header-1920x250.jpeg);
}
.class-title .section-title p{
    color: black;
}
.class-title .section-title h2 {
	font-weight: 500;
    color: #ffdb58;
}

.classes-item {
	height: 380px;
	margin-left: -15px;
	margin-right: -15px;
	padding-left: 60px;
	padding-top: 80px;
	padding-right: 35px;
}

.classes-item:hover:before {
	opacity: 1;
}

.classes-item:before {
	position: absolute;
	left: 0;
	bottom: 0;
	width: 100%;
	height: 5px;
	background: #e4381C;
	content: "";
	opacity: 0;
	-webkit-transition: all 0.3s;
	-o-transition: all 0.3s;
	transition: all 0.3s;
}

.classes-item h4 {
	font-weight: 600;
	color: #ffdb58;
	text-transform: uppercase;
	margin-bottom: 20px;
}

.classes-item p {
	color: #ffffff;
	margin-bottom: 38px;
}

.classes-item .primary-btn.class-btn {
	background-image: -webkit-gradient(linear, left top, right top, color-stop(100%, #2f4f4f), color-stop(0%, #2f4f4f)), -webkit-gradient(linear, left top, right top, color-stop(100%, #2f4f4f), color-stop(0%, #2f4f4f));
	background-image: -o-linear-gradient(left, #2f4f4f 100%, #2f4f4f 0%), -o-linear-gradient(left, #2f4f4f 100%, #2f4f4f 0%);
	background-image: linear-gradient(to right, #2f4f4f 100%, #2f4f4f 0%), linear-gradient(to right, #2f4f4f 100%, #2f4f4f 0%);
}

.classes-item .primary-btn.class-btn:hover:after {
	opacity: 1;
}
.bootcamp .classes-item{
    background-color: #ff6347;
}
.balance .classes-item{
    background-color: #ff6347;
}
.about-Rin{
 background-color: aqua;
}
.about-Rin img {
	min-width: 100%;
    width:500px;
    height: 500px;
    float: left;
    padding-bottom: -50px;
    padding-top: 70px;
    padding-left: 20px;
    padding-right: 20px;
}
.about-text2 {
	padding-top: 58px;
    padding-bottom: 28px;
}

.about-text2 h2 {
	font-size: 48px;
	font-weight: 500;
	color: #ffdb58;
	text-transform: uppercase;
	margin-bottom: 36px;
}

.about-text2 p.short-details {
	font-size: 20px;
	font-weight: 600;
	color:#ffdb58;
	line-height: 28px;
	margin-bottom: 10px;
}

.about-text2 p.long-details {
	color: #ffffff;
	margin-bottom: 20px;
}
.classes-item2 {
	height: 490px;
	margin-left: -15px;
	margin-right: -15px;
	padding-left: 30px;
	padding-top: 60px;
	padding-right: 35px;
}

.classes-item2:hover:before {
	opacity: 1;
}

.classes-item2:before {
	position: absolute;
	left: 0;
	bottom: 0;
	width: 100%;
	height: 5px;
	background: #e4381C;
	content: "";
	opacity: 0;
	-webkit-transition: all 0.3s;
	-o-transition: all 0.3s;
	transition: all 0.3s;
}

.classes-item2 h4 {
	font-weight: 600;
	color: #ffdb58;
	text-transform: uppercase;
	margin-bottom: 20px;
}

.classes-item2 p {
	color: #ffffff;
	margin-bottom: 38px;
}
.question1 .classes-item2{
    background-color: #8b008b;
}
.question2 .classes-item2{
    background-color: #c71585;
}
.question3 .classes-item2{
    background-color: #ff6347;
}
.question4 .classes-item2{
    background-color: #ff1493;
}
.aboutus-section{
    background-color:#151515;
    padding-left: 5px;
    padding-top: 50px;
    padding-bottom: 50px;
}
.about-us{
    padding-top: 60px;
    padding-left: 60px;
    padding-right: 60px;
    background-image: url(img/RK.png);
    float: left;
    padding-bottom: 60px;
    color:white;
}
.about-quality{
    padding-top: 60px;
    padding-left: 60px;
    padding-right: 60px;
    background-image: url(img/RK.png);
    float: left;
    padding-bottom: 63px;
    color:white;
}
.video {
	height: 590px;
	position: relative;
    
}

.video iframe {
	width: 50%;
    height: 590px;
    padding-top: 80px;
}

.video-detalis {
	width: 420px;
	padding: 40px;
	background: #ffffff;
	position: absolute;
	right: 120px;
	top: 80px;
	-webkit-box-shadow: 6px 6px 50px rgba(198, 198, 198, 0.2);
	box-shadow: 6px 6px 50px rgba(198, 198, 198, 0.2);
}
.video-detalis .open-time2 {
	overflow: hidden;
	margin-bottom: 10px;
}

.video-detalis .open-time2 h5 {
	font-size: 20px;
	color: #000000;
	font-weight: 500;
	text-transform: uppercase;
	float: left;
}

.video-detalis .open-time2 ul {
	float: right;
}
.about-us2{
    padding-top: 60px;
    padding-left: 60px;
    padding-right: 60px;
    background-image: url(img/RK.png);
    float: left;
    padding-bottom: 60px;
    color:white;
}
.about-quality2{
    padding-top: 60px;
    padding-left: 60px;
    padding-right: 60px;
    background-image: url(img/RK.png);
    float: left;
    padding-bottom: 68px;
    color:white;
}
.about-quality2 h4{
    color:#ffdb58;
}
.about-us2 h4{
    color:#ffdb58;
}
.video {
    padding-left:100px;
    padding-top:40px;
    background-color: #2f4f4f;
}
.video2 {
	padding-left:100px;
    padding-top:40px;
    background-color: #2f4f4f;
    
}
.mini-vid img{
    width: 500px;
    height: 500px;
    position: relative;
}
.mini-vid .btn{
    top:430px;
    background-color:#ffdb58;
    color:#2f4f4f;
    font-size:16px;
    border-radius: 5px;
    cursor: pointer;
    position: absolute;
    left:280px;
}
.mini-vid .btn2{
    top:430px;
    background-color:#ffdb58;
    color:#2f4f4f;
    font-size:16px;
    border-radius: 5px;
    cursor: pointer;
    position: absolute;
    left:280px;
}
.class-title2 {
	padding-top: 60px;
	padding-bottom: 62px;
    background-image: url(img/green-tea.png);
}
.class-title2 .section-title p{
    color: black;
}
.class-title2 .section-title h2 {
	font-weight: 1000;
    color: #ffdb58;
    font-size: 60px;
}
.mini-vid .btn2{
    top:430px;
    background-color:#2f4f4f;
    color:#ffdb58;
    font-size:16px;
    border-radius: 15px;
    cursor: pointer;
    position: absolute;
    left:310px;
    padding-bottom: 10px;
    padding-left: 10px;
    padding-right: 10px;
    padding-top: 10px;
}

.about-text p.short-details2 {
	font-size: 25px;
	font-weight: 600;
	color: #ffdb58;
	line-height: 28px;
	margin-bottom: 20px;
    padding-top: 50px;
}

.about-text p.long-details2 {
	color: #ffffff;
	margin-bottom: 40px;
    padding-top: 20px;
}
.calc-outer-wrap{
    padding-left: 80px;
    padding-top: 50px;
    padding-bottom: 60px;
    background-color: #2f4f4f;
    color: white;
    font-size: 15px;
}
.field{
    padding-right: 500px;
    padding-top: -10px;
}
field-outer{
     padding-right: 500px;
     padding-top: -10px;
}
.form-submit{
    background-color: #ffdb58;
    color: #2f4f4f;
    text-decoration: none;
    border: 1px solid;
    border-radius: 13px;
    font-size: 23px;
    padding-left: 10px;
    padding-right: 10px;
    line-height: 47px;
    top:100%;
}
.field-medium{
    border-radius: 33px;
    background-color: #2f4f4f;
}
.field-small{
    padding-bottom: 20px;
    border-radius: 33px;
}
```
## about.html:
!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel = "stylesheet" type="text/css" href="first.css">
    <title>Fit coach</title>
    
<header>
<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <div class="container-fluid">
    <a class="navbar-brand" href="#">Rina Karim</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link" href="main.html">HOME
              </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="about.html" target="_blank">ABOUT US<span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="services.html" target="_blank">SERVICES</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="nutrition.html" target="_blank">NUTRITION</a>
        </li>
          <li class="nav-item">
          <a class="nav-link" href="calculation.html" target="_blank">CALCULATION</a>
        </li>
      </ul>
    </div>
    </div>
</nav>
</header>
<!-- Aboutus Section Begin -->
    <section class="aboutus-section spad">
        <div class="container">
            <div class="aboutus-page-text">
                <img src="img/about-us.jpg" alt="">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="about-us">
                            <h4>ABOUT US</h4>
                            <p>The Online Fitness Coach program offers a unique approach to help you reach your goals through one-on-one customized online fitness and nutrition coaching. Training and nutrition plans are personally tailored to your lifestyle, your goals, and your individual needs. Work directly online with Coach Rina Karim, one of the top online fitness coaches in Kazakhstan to lose weight, build lean muscle, and improve the quality of your life.
                             <p>This is also the merit of FPA, because on the course "Fitness Nutritionist" very competent lecture on psychology, after which you became deeper interested in this area. We have read the recommended reading which is very helpful in working with people.</p>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="about-quality">
                            <h4>OUR QUALITY</h4>
                            <p>We are constantly pushing the boundaries for member experience, and virtual helps us do this; it adds value to our studio space and gives members flexibility and varied training options. We see the ROI through its marketing value and retention abilities.</p> <p>We are one of the most innovative and well-known brands in the world. We are the most highly effective fitness coaching company as we have sufficient qualifications and achievements. Our unique program includes:</p>
                                <br><i class="fa fa-check-circle-o"></i> Accessible connection with a coach 24/7
                                <br><i class="fa fa-check-circle-o"></i> Passage of measurements
                                <br><i class="fa fa-check-circle-o"></i> Convenient schedule
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Aboutus Section End -->
 <section class="classes-section">
        <div class="class-title set-bg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-7 m-auto text-center">
                        <div class="section-title pl-lg-4 pr-lg-4 pl-0 pr-0">
                            <h2>Answers to frequently asked questions</h2>
                            <p>with Rina Karim</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
<section class="home-about spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <div class="about-text2">
                        <h2>ABOUT Rinata Karim</h2>
                        <p class="short-details">Who is Rinata Karim?</p>
                        <p class="long-details">Certified Gym & Group Trainer</p>

                        <p class="short-details">Sports achivements:</p>
                        <p class="long-details">Certified Trainer "Reebok. Become Human"</p>

                        <p class="short-details">Specialization:</p>
     <p class="long-details">Strength and functional training, Mind Body, rehabilitation, weight loss, muscle gain, step aerobics, aerobics, trekking, cycle, myofascial release, dietetics and nutritionology.</p>

                        <p class="short-details">Motto:</p>
 <p class="long-details">Become a coach whose clients get into their sneakers on Sunday morning and go to perform their personal feats.  They should be interested in following you.</p>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="about-Rin">
                        <img src="img/Rinata.jpeg" alt="rk">
                    </div>
                </div>
            </div>
        </div>
    </section>

<section class="classes-section">
<div class="container-fluid">
            <div class="row">
                <div class="col-lg-3 col-sm-6">
                    <div class ="question3">
                    <div class="classes-item2 set-bg">
                        <h4>Where did you start?</h4>
                        <p>Like many others, I started my path in fitness with self-study, about fifteen years ago, when I was still studying at the University of Economics in the main specialty at the Faculty of Accounting, Analysis and Audit of Foreign Economic Activity.  Even then, I was attracted by the topic of fitness, and I graduated from courses at the State University of Physical Culture, at the same time I trained.</p>
                    </div>
                </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class ="question1">
                    <div class="classes-item2 set-bg">
                        <h4>Who are your clients?</h4>
                        <p>My clients are ordinary people who want to deal with their diet, appearance and health, and improve their quality of life.
                        </p>
                    </div>
                </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class ="question4">
                    <div class="classes-item2 set-bg">
                        <h4>Why did you go to study at "Fitness Nutritionist"?</h4>
                        <p>I liked everything on the course!  I went to study because I wanted to structure my knowledge.  After reading the program of the "Fitness Nutritionist" course, I realized that this was exactly what I needed: I liked the structure and the competent approach.  In general, FPA is a well-established fitness training organization in America.</p>
                    </div>
                </div>
                </div>
                <div class="col-lg-3 col-sm-6">
                    <div class ="question2">
                    <div class="classes-item2 set-bg">
                    <h4>What transformations for your customers are you proud of?
</h4>
                        <p>I am proud of the change in their lifestyle.  It is not very difficult to change any weight loss program or marathon in a month, but it is much more difficult to change your habits and lifestyle.  What I am proud of are long-term results.  </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</section>
<head>
  <title>Footer</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">
</head>
<footer class="container-fluid bg-grey py-5">
<div class="container">
   <div class="row">
      <div class="col-md-6">
         <div class="row">
            <div class="col-md-6">
               <div class="logo-part">
                  <img src="img/RK.png" class="w-50 logo-footer" >
                  <p>Location: </p>
                  <p>Kazakhstan, Nur-Sultan</p>
               </div>
            </div>
            <div class="col-md-6 px-4">
               <h6>Rina Karim</h6>
               <p>Fitness Coach Company</p>
               <a href="#" class="btn-footer"> More Info </a><br>
               <a href="https://wa.me/87019007557" class="btn-footer"> Contact Us</a>
            </div>
         </div>
      </div>
      <div class="col-md-6">
         <div class="row">
            <div class="col-md-6 px-4">
               <h6> Help us</h6>
               <div class="row ">
                  <div class="col-md-6">
                     <ul>
                        <li> <a href="#"> Home</a> </li>
                        <li> <a href="about.html"> About</a> </li>
                        <li> <a href="services.html"> Service</a> </li>
                        <li> <a href="https://www.facebook.com/rinata.ermekbaeva"> Team</a> </li>
                        <li> <a href="https://wa.me/87019007557"> Contact</a> </li>
                     </ul>
                  </div>
               </div>
            </div>
            <div class="col-md-6 ">
               <h6>You can find us here:</h6>
               <div class="social">
                  <a href="https://www.facebook.com/rinata.ermekbaeva"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                  <a href="https://www.instagram.com/rina_fitnessforhealth/"><i class="fa fa-instagram" aria-hidden="true" ></i></a>
               </div>
            </div>
         </div>
      </div>
   </div>
</div>
</footer>
    </head>
    <script src="jquery-3.6.0.min.js"></script>
<script src="img.js"></script>
</html>
```html


```
## services.html:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel = "stylesheet" type="text/css" href="first.css">
    <title>Fit coach</title>
    
<header>
<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <div class="container-fluid">
    <a class="navbar-brand" href="#">Rina Karim</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link" href="main.html">HOME
              </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="about.html" target="_blank">ABOUT US</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="services.html" target="_blank">SERVICES</a>
         <span class="sr-only">(current)</span>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="nutrition.html" target="_blank">NUTRITION</a>
        </li>
          <li class="nav-item">
          <a class="nav-link" href="calculation.html" target="_blank">CALCULATION</a>
        </li>
      </ul>
    </div>
    </div>
</nav>
<!-- Aboutus Section Begin -->
    <section class="aboutus-section spad">
        <div class="container">
            <div class="aboutus-page-text">
                <img src="img/about-us.jpg" alt="">
                <div class="row">
                    <div class="col-lg-6">
                        <div class="about-us2">
                            <h4>Personal Training Program</h4>
                             <p>Dynamically innovate resource-leveling customer service for state of the art customer service. Objectively innovate empowered. Efficiently unleash cross-media information without cross.</p>
                             <p>Objectively innovate empowered manufactured products whereas parallel platforms. Holisticly predominate extensible testing procedures for reliable supply chains. Dramatically engage top-line web services vis-a-vis cutting-edge deliverables. Leverage agile frameworks to provide a robust synopsis for high level overviews.</p>
                            <p>*Below you will find free video trainings from our coach. </p>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="about-quality2">
                            <h4>WHAT TO EXPECT:</h4>
                            <p>Completely synergize resource taxing relationships via premier niche markets. 
                                <br>
                                <br><i class="fa fa-check-circle-o"></i> Decreased Total Cholesterol
                                <br><i class="fa fa-check-circle-o"></i> Improved Coordination
                                <br><i class="fa fa-check-circle-o"></i> Enhanced Immune System 
                                <br><i class="fa fa-check-circle-o"></i>  Improved Cardiovascular Fitness
                                <br><i class="fa fa-check-circle-o"></i> Decreased Body Fat Stores
                                <br><i class="fa fa-check-circle-o"></i> Increased Muscle Strength, Endurance & Tone 
                                <br><i class="fa fa-check-circle-o"></i> Reduction in Blood Pressure 
                                <br><i class="fa fa-check-circle-o"></i> Decreased Symptoms of Anxiety, Stress, Tension 
                                <br><i class="fa fa-check-circle-o"></i> Increased Energy, Stamina & Endurance
                                
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
<!-- Aboutus Section End -->
<div class="video">
       <div class="mini-vid">
       <img src="img/bpress-1.jpg">
       <a href="https://youtu.be/Pgzvx901xWA"class="btn">WATCH VIDEO</a></div>
        <div class="video-detalis">
            <div class="open-time2">
                <h5>Bench press:</h5>
                <ul>
                    <li>Bench press is a basic physical exercise with free weight.  The person performing the exercise lies down on a bench, lowers the bar until it touches the chest and raises it until the elbow is fully extended.</li>
                </ul>
            </div>
        </div>
    </div>    
    <div class="video">
        <div class="mini-vid">
            <img src="img/squat-1.jpg"><a href="https://youtu.be/wuTVHpOCOOg"class="btn">WATCH VIDEO</a></div>
        <div class="video-detalis">
            <div class="open-time2">
                <h5>Squats:</h5>
                <ul>
                    <li>Squats are one of the basic strength exercises (including in powerlifting and bodybuilding);  performing the exercise squats and then stands up, returning to a standing position.  Squatting is considered one of the most important exercises not only in strength sports, but also in general physical training, and is also used as an auxiliary in the process of training athletes in almost all sports disciplines.</li>
                </ul>
            </div>
        </div>
    </div>    
    <div class="video">
    <div class="mini-vid">
        <img src="img/press-1.jpg"><a href="https://youtu.be/O5I7TbSCaj8"class="btn">WATCH VIDEO</a></div>
        <div class="video-detalis">
            <div class="open-time2">
                <h5>Barbell press:</h5>
                <ul>
                    <li>The standing barbell press is one of five basic strength exercises.  The key working muscle group when performing it is the middle bundle of deltas - however, due to the need to maintain a stable position, the muscles of the arms and trunk are also involved in the exercise.</li>
                </ul>
            </div>
        </div>
    </div>    
    <div class="video">
        <div class="mini-vid">
            <img src="img/jump-1.jpg"><a href="https://youtu.be/dkPkxmJyyRU"class="btn">WATCH VIDEO</a></div>
        <div class="video-detalis">
            <div class="open-time2">
                <h5>Jumping Jack:</h5>
                <ul>
                    <li>Jumping Jack is an exercise that is jumping with a simultaneous extension of the arms and legs.  Jumping Jack is probably the most popular cardio exercise and is very often included in aerobic and interval training.</li>
                </ul>
            </div>
        </div>
    </div>    
    <div class="video">
        <div class="mini-vid">
            <img src="img/push-1.jpg"><a href="https://youtu.be/Kr73BlHsvEo"class="btn">WATCH VIDEO</a></div>
        <div class="video-detalis">
            <div class="open-time2">
                <h5>Incline push-ups:</h5>
                <ul>
                    <li>Incline push-ups can be used to target specific areas of the chest or to add variety to your regular workout routine.  Depending on the position of your body relative to the horizon, you can increase or decrease the load compared to classic push-ups, and also shift its emphasis to the lower or upper pectoral muscles.</li>
                </ul>
            </div>
        </div>
    </div>    
<head>
  <title>Footer</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">
</head>
<footer class="container-fluid bg-grey py-5">
<div class="container">
   <div class="row">
      <div class="col-md-6">
         <div class="row">
            <div class="col-md-6">
               <div class="logo-part">
                  <img src="img/RK.png" class="w-50 logo-footer" >
                  <p>Location: </p>
                  <p>Kazakhstan, Nur-Sultan</p>
               </div>
            </div>
            <div class="col-md-6 px-4">
               <h6>Rina Karim</h6>
               <p>Fitness Coach Company</p>
               <a href="#" class="btn-footer"> More Info </a><br>
               <a href="https://wa.me/87019007557" class="btn-footer"> Contact Us</a>
            </div>
         </div>
      </div>
      <div class="col-md-6">
         <div class="row">
            <div class="col-md-6 px-4">
               <h6> Help us</h6>
               <div class="row ">
                  <div class="col-md-6">
                     <ul>
                        <li> <a href="#"> Home</a> </li>
                        <li> <a href="about.html"> About</a> </li>
                        <li> <a href="services.html"> Service</a> </li>
                        <li> <a href="https://www.facebook.com/rinata.ermekbaeva"> Team</a> </li>
                        <li> <a href="https://wa.me/87019007557"> Contact</a> </li>
                     </ul>
                  </div>
               </div>
            </div>
            <div class="col-md-6 ">
               <h6>You can find us here:</h6>
               <div class="social">
                  <a href="https://www.facebook.com/rinata.ermekbaeva"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                  <a href="https://www.instagram.com/rina_fitnessforhealth/"><i class="fa fa-instagram" aria-hidden="true" ></i></a>
               </div>
            </div>
         </div>
      </div>
   </div>
</div>
</footer>
</header>
</head>
<script src="jquery-3.6.0.min.js"></script>
<script src="img.js"></script>
</html>

```
## nutrition.html:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel = "stylesheet" type="text/css" href="first.css">
    <title>Fit coach</title>
    
<header>
<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <div class="container-fluid">
    <a class="navbar-brand" href="#">Rina Karim</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link" href="main.html">HOME
                <span class="sr-only">(current)</span>
              </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="about.html" target="_blank">ABOUT US</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="services.html" target="_blank">SERVICES</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="nutrition.html" target="_blank">NUTRITION</a>
        </li>
          <li class="nav-item">
          <a class="nav-link" href="calculation.html" target="_blank">CALCULATION</a>
        </li>
      </ul>
    </div>
    </div>
</nav>
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
      <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
      <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
      
      <div class="carousel-item active" style="background-image: url('img/food3.jpg')">
        <div class="carousel-caption d-none d-md-block">
          <h2 class="display-4">Choose your Nutrition Plan!</h2>
          <p class="lead"></p>
        </div>
      </div>
   
      <div class="carousel-item" style="background-image: url('img/food2.jpg')">
        <div class="carousel-caption d-none d-md-block">
          <h2 class="display-4">Look at our menu</h2>
          <p class="lead"></p>
        </div>
      </div>
      
      <div class="carousel-item" style="background-image: url('img/greenimg.jpg')">
        <div class="carousel-caption d-none d-md-block">
          <h2 class="display-4">We are glad to see you!</h2>
          <p class="lead"></p>
        </div>
      </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
  </div>
</header>
<!-- Aboutus Section End -->
<div class="video">
       <div class="mini-vid">
       <img src="img/femfatloss-1.jpg">
       <a href="https://wa.me/87019007557"class="btn2">ORDER</a></div>
        <div class="video-detalis">
            <div class="open-time2">
                <h5>Female slimming program:</h5>
                <br>
                    <br><i class="fa fa-check-circle-o"></i> 1200 kcal/day
                    <br><i class="fa fa-check-circle-o"></i> 1600 kcal/day
                    <br><i class="fa fa-check-circle-o"></i> 2000 kcal/day
                    <br><i class="fa fa-check-circle-o"></i> 2600 kcal/day
            </div>
        </div>
    </div>    
    <div class="video">
        <div class="mini-vid">
            <img src="img/manloss-1.jpg"><a href="https://wa.me/87019007557"class="btn2">ORDER</a></div>
        <div class="video-detalis">
            <div class="open-time2">
                <h5>Male slimming program:</h5>
                <br>
                    <br><i class="fa fa-check-circle-o"></i> 1800 kcal/day
                    <br><i class="fa fa-check-circle-o"></i> 2100 kcal/day
                    <br><i class="fa fa-check-circle-o"></i> 2600 kcal/day
                    <br><i class="fa fa-check-circle-o"></i> 3000 kcal/day
            </div>
        </div>
    </div>
    <section class="classes-section">
        <div class="class-title2 set-bg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-7 m-auto text-center">
                        <div class="section-title pl-lg-4 pr-lg-4 pl-0 pr-0">
                            <h2>Express Programs:</h2>
                            <p></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <div class="video">
    <div class="mini-vid">
        <img src="img/express-1.jpg"><a href="https://wa.me/87019007557"class="btn2">ORDER</a></div>
        <div class="video-detalis">
            <div class="open-time2">
                <h5>Express weight loss:</h5>
                <br>
                    <br><i class="fa fa-check-circle-o"></i> 500 kcal/day
                    <br><i class="fa fa-check-circle-o"></i> 800 kcal/day
                    <br><i class="fa fa-check-circle-o"></i> 1000 kcal/day
                    <br><i class="fa fa-check-circle-o"></i> 1200 kcal/day
            </div>
        </div>
    </div>    
    <div class="video">
        <div class="mini-vid">
            <img src="img/detox-1.jpg"><a href="https://wa.me/87019007557"class="btn2">ORDER</a></div>
        <div class="video-detalis">
            <div class="open-time2">
                <h5>Detox program:</h5>
                <br>
                    <br><i class="fa fa-check-circle-o"></i> herbal
                    <br><i class="fa fa-check-circle-o"></i> lactic
                    <br><i class="fa fa-check-circle-o"></i> mixed
                    <br><i class="fa fa-check-circle-o"></i> smoothies
            </div>
        </div>
    </div>      

<head>
  <title>Footer</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">
</head>
<footer class="container-fluid bg-grey py-5">
<div class="container">
   <div class="row">
      <div class="col-md-6">
         <div class="row">
            <div class="col-md-6">
               <div class="logo-part">
                  <img src="img/RK.png" class="w-50 logo-footer" >
                  <p>Location: </p>
                  <p>Kazakhstan, Nur-Sultan</p>
               </div>
            </div>
            <div class="col-md-6 px-4">
               <h6>Rina Karim</h6>
               <p>Fitness Coach Company</p>
               <a href="#" class="btn-footer"> More Info </a><br>
               <a href="https://wa.me/87019007557" class="btn-footer"> Contact Us</a>
            </div>
         </div>
      </div>
      <div class="col-md-6">
         <div class="row">
            <div class="col-md-6 px-4">
               <h6> Help us</h6>
               <div class="row ">
                  <div class="col-md-6">
                     <ul>
                        <li> <a href="#"> Home</a> </li>
                        <li> <a href="about.html"> About</a> </li>
                        <li> <a href="services.html"> Service</a> </li>
                        <li> <a href="https://www.facebook.com/rinata.ermekbaeva"> Team</a> </li>
                        <li> <a href="https://wa.me/87019007557"> Contact</a> </li>
                     </ul>
                  </div>
               </div>
            </div>
            <div class="col-md-6 ">
               <h6>You can find us here:</h6>
               <div class="social">
                  <a href="https://www.facebook.com/rinata.ermekbaeva"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                  <a href="https://www.instagram.com/rina_fitnessforhealth/"><i class="fa fa-instagram" aria-hidden="true" ></i></a>
               </div>
            </div>
         </div>
      </div>
   </div>
</div>
</footer>
    </head>
    <script src="jquery-3.6.0.min.js"></script>
<script src="img.js"></script>
</html>


```
## calculation.html:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel = "stylesheet" type="text/css" href="first.css">
    <title>Fit coach</title>
    
<header>
<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <div class="container-fluid">
    <a class="navbar-brand" href="#">Rina Karim</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link" href="main.html">HOME
                <span class="sr-only">(current)</span>
              </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="about.html" target="_blank">ABOUT US</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="services.html" target="_blank">SERVICES</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="nutrition.html" target="_blank">NUTRITION</a>
        </li>
          <li class="nav-item">
          <a class="nav-link" href="calculation.html" target="_blank">CALCULATION</a>
        </li>
      </ul>
    </div>
    </div>
</nav>
</header>

<section class="home-about spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <div class="about-text">
                        <h2></h2>
                        <p class="short-details2">Calculate your metabolic rate with Rina Karim</p>
                        <p class="long-details2">The goal of this program is to help people to develop their athletic position through personal training.  This calculator have been developed by our experienced trainers.</p>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="about-img">
                        <img src="img/RK.png" alt="rk">
                    </div>
                </div>
            </div>
        </div>
    </section>
    
<div class="calc-outer-wrap">
<div id="form-error" style="display:none;"></div>
<form class="calc-form" id="calc-form">
  <div class="form-fields">

    <div class="field-outer">
      <label for="distance" class="top-label">Age:</label>
      <div class="field-items">
        <div class="field field-medium">         
          <input type="text" name="age" id="age" inputmode="numeric" pattern="[0-9]*">
        </div>
        
        <div class="field field-medium">
          <select name="gender">
            <option value="Female">Female</option>
            <option value="Male">Male</option>
                   
          </select>
        </div>
      </div>
    </div>

    <div class="field-outer">
      <label for="height" class="top-label">Height:</label>
      <div class="field-items">
        <div class="field">
          <input type="text" name="height_ft" id="height-ft" inputmode="numeric" pattern="[0-9]*">
          <label for="height-ft">Feet: </label>
        </div>
        <div class="field">
          <input type="text" name="height_in" id="height-in" inputmode="numeric" pattern="[0-9]*">
          <label for="height-in">In centimeters:</label>
        </div>
       <div class="field">
          <input type="text" name="height_cm" id="height-cm" inputmode="numeric" pattern="[0-9]*">
          <label for="height-cm"></label>
        </div>        
      </div>
    </div>

    <div class="field-outer">
      <label for="weight" class="top-label">Your weight:</label>
      <div class="field-items">
        <div class="field field-large">
          <input type="text" name="weight" id="weight" inputmode="numeric" pattern="[0-9]*">
        </div>
        <div class="field field-small">
          <select name="weight_unit">
            <option value="kg">kg</option>
          </select>
        </div>
      </div>
    </div>
   <div class="btn-wrap field-outer">
    <button class="form-submit">Calculate</button>
  </div>
  </div>


</form>
<div id="results" style="display:none;"></div>
</div>

<head>
  <title>Footer</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">
</head>
<footer class="container-fluid bg-grey py-5">
<div class="container">
   <div class="row">
      <div class="col-md-6">
         <div class="row">
            <div class="col-md-6">
               <div class="logo-part">
                  <img src="img/RK.png" class="w-50 logo-footer" >
                  <p>Location: </p>
                  <p>Kazakhstan, Nur-Sultan</p>
               </div>
            </div>
            <div class="col-md-6 px-4">
               <h6>Rina Karim</h6>
               <p>Fitness Coach Company</p>
               <a href="#" class="btn-footer"> More Info </a><br>
               <a href="https://wa.me/87019007557" class="btn-footer"> Contact Us</a>
            </div>
         </div>
      </div>
      <div class="col-md-6">
         <div class="row">
            <div class="col-md-6 px-4">
               <h6> Help us</h6>
               <div class="row ">
                  <div class="col-md-6">
                     <ul>
                        <li> <a href="#"> Home</a> </li>
                        <li> <a href="about.html"> About</a> </li>
                        <li> <a href="services.html"> Service</a> </li>
                        <li> <a href="https://www.facebook.com/rinata.ermekbaeva"> Team</a> </li>
                        <li> <a href="https://wa.me/87019007557"> Contact</a> </li>
                     </ul>
                  </div>
               </div>
            </div>
            <div class="col-md-6 ">
               <h6>You can find us here:</h6>
               <div class="social">
                  <a href="https://www.facebook.com/rinata.ermekbaeva"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                  <a href="https://www.instagram.com/rina_fitnessforhealth/"><i class="fa fa-instagram" aria-hidden="true" ></i></a>
               </div>
            </div>
         </div>
      </div>
   </div>
</div>
</footer>
    </head>
    <script src="jquery-3.6.0.min.js"></script>
<script src="js/img.js"></script>
<script src="js/calc.js"></script>
</html>


```
## calc.js:

```javascript
(function() {
    const form    = document.getElementById('calc-form');
    const results = document.getElementById('results');
    const errors  = document.getElementById('form-error');
    function errorMessage(msg) {
        errors.innerHTML = msg;
        errors.style.display = '';
        return false;
    }

    function showResults(calories) {
        results.innerHTML = `<p>Your metabolic rate is: <strong>${(calories).toFixed(2)} </strong> calories a day.</p>`;
      results.style.display = ''
      form.style.display = 'none'
      errors.style.display = 'none'
    }
  
    function resetForm(e) {
      if(e.target.id = 'rs') {
        e.preventDefault();
        results.style.display = 'none';
        form.style.display = '';
        form.reset()
      }
    }

    function submitHandler(e) {
        e.preventDefault();
        //parse Age
        let age = parseFloat(form.age.value);
        if(isNaN(age) || age < 0) {
            return errorMessage('Please enter a valid age');
        }
        //parse Height
        let heightCM = parseFloat(form.height_cm.value);
        if(isNaN(heightCM) || heightCM < 0) {
            
          let heightFeet = parseFloat(form.height_ft.value);
          if(isNaN(heightFeet) || heightFeet < 0) {
              return errorMessage('Please enter a valid Height in feet or centimeters');
          }      
         let heightInches = parseFloat(form.height_in.value);
          if(isNaN(heightInches) || heightInches < 0) {
              heightInches=0;
          }   
          heightCM = (2.54 * heightInches) + (30.4 * heightFeet)
        }   
          let weight = parseFloat(form.weight.value);
          if(isNaN(weight) || weight < 0) {
              return errorMessage('Please enter a valid weight');
          }   
      
       let calories = 0;
       if(form.gender.value == 'Female') {
         //for female
         calories = 655.09 + (9.56 * weight) + (1.84 * heightCM) - (4.67 * age);
        }
        //for male
        else {
         calories = 66.47 + (13.75 * weight) + (5 * heightCM) - (6.75 * age);
        }
        //results
       showResults(calories);
    }
    form.addEventListener('submit', submitHandler);
    results.addEventListener('click', resetForm, true);

})();
```

## Conclusion
 The main goal of this website is that every person known about the “Rina Karim” fitness coach and its all the facility. 
 This website will help people find the most effective and convenient programs.  
 Through the website, customers can view different types of workouts as well as nutrition programs. 
 This website is characterized by its easy accessibility.  


## References
Karim, R. (Director). (2021, March 23). Rinakar [Video file]. Retrieved March 24, 2021, from https://youtu.be/Pgzvx901xWA

Karim, R. (Director). (2021, March 23). RinaKarim [Video file]. Retrieved March 24, 2021, from https://youtu.be/wuTVHpOCOOg
