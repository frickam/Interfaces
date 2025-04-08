public class ShortWordFilter implements Filter
{
    @Override
    public boolean accept(Object obj)
    {
        if (obj instanceof String)
        {
            String str = (String) obj;
            return str.length() < 5;
        }
        return false;
    }
}

