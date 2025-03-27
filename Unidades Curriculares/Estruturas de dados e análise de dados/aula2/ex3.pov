 	
#include "colors.inc"
#include "shapes.inc"

light_source {<400,0,-400> White} 
light_source {<-400,0,-400> White}

camera 
{   location <0,0,-150> 
    look_at <0,0,0> 
} 

background { White}

//parte de cima
cone 
{   <-20, 0,0> , 2
    <-20,50,0> , 20
    texture { pigment {Green}}
}

//parte de baixo
cone 
{   <-20, 0, 0> , 0
    <-20,-50,0> , 20
    texture { pigment {Blue}}
}

//cone aberto
cone 
{   <40,45,50>, 5
    <25,0,-50>, 15
    open
    texture { pigment {Red}}
} 

//apoio do cone aberto 
cone 
{   <40,45,50>, 1
    <40,-60,50> , 10
    texture { pigment {Blue}}
}
