#include "colors.inc"

light_source {<-20,0,-20> White} 
light_source {< 20,0,-20> White}

camera 
{   location <5,5,-8> 
    look_at <0,3,0> 
} 

sky_sphere 
{   pigment 
    {    gradient y
         color_map { [0.0 color rgb <0.7,0.7,1.0>] [1.0 color blue 0.5] }
    }
}

plane 
{   <0, 1, 0>, -1 
    pigment { checker color White, color Red }
} 


torus 
{   1.0,0.25 scale <1,1,1> rotate<0,0,0> translate<0,0,0>
    texture
    {   pigment{color rgb<1,0.65,0>}
        finish {ambient 0.15 diffuse 0.85 phong 1}
    }
}
torus 
{   1.0,0.25 scale <1,3,1> rotate<90,0,0> translate<4,3,2>
    texture
    {   pigment{color GreenCopper}
        finish {ambient 0.15 diffuse 0.85 phong 1}
    }
} 
torus 
{   1.0,0.65 scale <1.5,0.33,1> rotate<0,0,90> translate<-1,3,-2>
    texture
    {   pigment{color NeonPink}
        finish {ambient 0.15 diffuse 0.85 phong 1}
    }
}
