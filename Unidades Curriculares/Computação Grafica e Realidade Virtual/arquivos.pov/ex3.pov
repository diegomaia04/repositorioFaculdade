#include "colors.inc"

light_source {<40,50,-40> White}    
light_source {<40,50,-40> White}    

camera 
{   location <0,3,-10> 
    look_at <0,0,0> 
}                        

plane 
{   <0, 1, 0>, -1 
    pigment 
    { 
      checker color Red, color Blue 
    }  
}                

sky_sphere 
{   pigment 
    {   gradient y
        color_map { [0.0 color rgb <0.7,0.7,1.0>] 
                    [1.0 color blue 0.8] 
                  }
    } 
}
    
// Esfera em x=0, y=1, z=2 com raio=2 
sphere 
{   <0, -1, 2>, 2 
    texture 
    {   pigment 
        {   color White
        } 
    } 
} 



