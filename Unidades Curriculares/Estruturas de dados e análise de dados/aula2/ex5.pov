#include "colors.inc"
light_source {< 2,5, 5> White} 
light_source {< 2,5, 0> White} 

camera { 
  location <0,3,4> 
  look_at <2,0,0> 
} 

plane { <0, 1, 0>, -1 
    pigment { 
      checker color Red, color White 
    }} 

sky_sphere {
  pigment {
    gradient y
    color_map { [0.0 color rgb <0.7,0.7,1.0>] 
                [1.0 color blue 0.5] }
  }}


