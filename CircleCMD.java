class CircleCMD
{
    public static void main(String args[])
    {
        float r, area;
        r=Float.parseFloat(args[0]);
        area=3.14f*r*r;
        System.out.println("Area: " +area);
        System.out.println(args.length);

    }
}