#include "Simple_window.h" // get access to our window library
#include "Graph.h"
// get access to our graphics library facilitie sint ma in()
{
using namespace Graph_lib;
Point tl {100,100};
// our graphics facilitie s are in Graph_lib
// to be come top le ft corne r of window
Simple_window win {tl,600,400,"Canvas"};
// make a simple window
Polygon poly; // make a shape (a polygon)
poly.add(Point{300,200});
poly.add(Point{350,100});
poly.add(Point{400,200}); // add a point
// add anothe r point
// add a third point
poly.set_color(Color::red); // adjust properties of poly
win.attach (poly); // connect poly to the window
win.wait_for_button();
// give control to the display engine
}
