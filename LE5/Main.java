
public class Main
{
	public static void main(String[] args) {
		beverage w = new Whiskey();
		w.TemplateMethod(200);
		beverage b = new Beer();
		b.TemplateMethod(200);
		beverage r = new Rum();
		r.TemplateMethod(200);
	}
}
