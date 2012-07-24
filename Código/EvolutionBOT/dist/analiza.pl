#!/usr/bin/perl

my %almacen;

my $entrada = "salida.txt";
my $anterior;
my $masanterior;

open (ENTRADA,"<$entrada") || die "ERROR: No puedo abrir el fichero $entrada\n";

while ($linea=<>){
		chop($linea);
	#@procesa = split(/ /,$linea);
	if ($linea=~/Player 2 Wins!/){
		print "Resultado:";
		print $linea;
		print ":";
		print $anterior;
		print ":";
		print $masanterior;
		print "\n";
		
	}
		$masanterior = $anterior;
		$anterior= $linea;
		
}