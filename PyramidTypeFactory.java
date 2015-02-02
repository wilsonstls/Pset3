package pset3;
/**
*1/30/15
*Factory design pattern implementation that instantiates Pyramid object 
*/

public class PyramidTypeFactory
{
   public Pyramid makePyramidType(String pyramidType)
   {
      if (pyramidType.equals("%"))
        {
           return new PercentSignPyramid();
        } 
      else
      if (pyramidType.equals("#"))
        {
           return new PoundSignPyramid();
        } 
      else 
           throw new IllegalArgumentException(" Input Error - Not one of the available symbols!!");
    }
}