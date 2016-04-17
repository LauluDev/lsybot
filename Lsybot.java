

class Lsybot {
	public static void main(String[] args) throws Exception{
		URLGetter getter = new URLGetter();
		System.out.println("call getter");
		System.out.println(getter.imgURLFetch(20));
		//String imageURL = "http://dimg.donga.com/carriage/NEWS/content/SPORTS/Cartoon/2016/04/08/14600708491.jpg";
		//ImageGetter.saveImage(imageURL, "tester757.jpg");
	}
}
