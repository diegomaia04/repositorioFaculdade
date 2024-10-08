#include "colors.inc"
#include "shapes.inc" 

light_source {<200,200,-200> White} 

camera 
{   location <75,25,-150> 
    look_at <0,25,0> 
} 

// perna da esquerda
box 
{   <-40,0,-20>,
    <-20,50,20>
    pigment{ rgb<1.0,1.0,1.0> }
}

// perna da direita
box 
{   <40,0,-20>,
    <20,50,20>
    pigment{ rgb<1.0,1.0,1.0> }
}

// parte de cima
box 
{   <-40,50,-20>,
    <40,70,20> 
    pigment{ rgb<1.0,1.0,1.0> }
}

// uma tela de fundo (atras)
box 
{   <-200,300,300>,
    <200,0,310>
    pigment { rgb<0,0,1.0> }
}

// uma tela de fundo (ao lado)
box 
{   <-200,300,-310>,
    <-200,0,310>
    pigment { rgb<0,0,1.0> }
}

// uma tela para o ch�o
box 
{   <-200,0,310>
    <200,-10,-310>
    pigment { rgb<0,1.0,0> }
} 

