

class Lsybot {
	public static void main(String[] args) throws Exception{
		URLGetter getter = new URLGetter();
		final String directory = "Closer";
		for(int i=1; i<=757; i++) {
			System.out.print("getting URL for [" + i + "]... ");
			String imageURL = getter.imgURLFetch(i);
			System.out.print("saving [" + i + "]... ");
			String zeropad;
			if(i<10) zeropad = "00"+i;
			else if(i<100) zeropad = "0"+i;
			else zeropad = ""+i;
			ImageGetter.saveImage(imageURL, directory+"/"+directory+zeropad+".jpg");
		}
		//System.out.println("call getter");
		//System.out.println(getter.imgURLFetch(20));
		//String imageURL = "http://dimg.donga.com/carriage/NEWS/content/SPORTS/Cartoon/2016/04/08/14600708491.jpg";
		//ImageGetter.saveImage(imageURL, "tester757.jpg");
	}
}
