// Plano com textura em xadrez
#include "colors.inc"
light_source {<40,-50,-40> White} 
light_source {<-40,-50,-40> White}

camera 
{   location <0,0,-50> 
    look_at <0,0,0> 
} 

plane 
{   <0, 1, 0>, 1
    pigment 
    {   checker color Pink, color White 
    } 
} 