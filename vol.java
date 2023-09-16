// Write a class with the name volume using function overloading that computes
// the volume of a cube, a sphere and a cuboid.
// Formula
// volume of a cube (vc) = s*s*s
// volume of a sphere (vs) = 4/3* π* r* r*r (where π = 3.14 or 22/7)
// Volume of a cuboid (vcd) = l* b* h [15]

class vol
{
void volume(int s)
{
int vc=s*s*s;
System.out.println("The Volume of a Cube is"+vc);
}
void volume(double r)
{
double vs=(4/3.0)*3.15*r*r*r;
System.out.println("The Volume of Sphere is"+vs);
}
void volume(int l, int b, int h)
{
int vcd=l*b*h;
System.out.println("The Volume of a Cuboid is"+vcd);
}
}