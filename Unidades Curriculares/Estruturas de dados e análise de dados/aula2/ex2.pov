#include "colors.inc"
#include "shapes.inc" 
#include "woods.inc"
#include "textures.inc"

light_source {<20,20,-20> White} 

camera 
{   location <8,8,-8> 
    look_at  <0,2,4> 
} 

plane 
{   <0, 1, 0>, -1 
    pigment { checker color Yellow, color Red} 
} 

cylinder 
{   <0,0,0>,<0,3,0>,1 scale <1,1,1> rotate<0,0,0> translate<0,0,0> 
    texture
    {   pigment{color White}
        finish {ambient 0.15 diffuse 0.75 reflection 0.1 phong 1}
    }
}

cylinder 
{   <2,0,0>,<3.5,2,0>,0.2 scale <1,1,1> rotate<0,0,0> translate<0,0,-1>
    texture
    {   pigment{color Plum}
        finish {ambient 0.45 diffuse 0.55 phong 1}
    }
}

cylinder 
{   <3.5,2,0>,<5,0,0>,0.2 scale <1,1,1> rotate<0,0,0> translate<0,0,-1>
    texture
    {   pigment{color Plum}
        finish  {ambient 0.15 diffuse 0.85 phong 1}
    }
}

cylinder 
{   <0,0,0>,<0,0,0.5>,1					
    texture
    {   T_Wood1 scale 0.1 
        finish {ambient 0.15 diffuse 0.85 phong 1}
    }
    translate<5,2,3>
}

cylinder 
{   <0,0,0>,<0,0.2,0>,2  open  scale <1,1,0.5> rotate<0,0,0> translate<4,0,2>	
    texture
    {   pigment{color White}
        finish {ambient 0.15 diffuse 0.75 reflection 0.1 phong 1}
    }
}

cylinder 
{   <0,0,0>,<0,6,0>,2 scale <1,1,1> rotate<0,0,0> translate<3,0,6>	 
    texture
    {   Polished_Chrome  
        finish {reflection 1}
    }
}
                 
                
  