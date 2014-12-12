<style type="text/css">
<!--
body,td,th {
	color: #FFFFFF;
}
body {
	background-image: url(snow_queen_elsa_in_frozen-1280x800.jpg);
}
-->
</style><?PHP
$ed=$_POST['ed'];
$edl=$_POST['edl'];
$dc=$_POST['dc'];
$dcl=$_POST['dcl'];
$mat=$_POST['mat'];
$emi=$_POST['emi'];
$emil=$_POST['emil'];
$nt=$_POST['nt'];
$ntl=$_POST['ntl'];
$pointer;

$pointer=($ed*4+$edl*1+$dc*4+$dcl*1+$emi*3+$emil*1+$nt*4+$ntl*1+$mat*4)/23;


print "<H2>Your Pointer is <BR><BR><H1> $pointer</H1> </H2>";


?>
