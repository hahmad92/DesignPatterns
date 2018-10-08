package design.patterns.factory.method.coursera;

public abstract class KnifeStore {
	public Knife orderKnife(String knifeType) {
		Knife knife = null;
		// now creating a knife is a method in the class knife = createKnife(knifeType);
		knife.sharpen();
		knife.polish();
		knife.package1();
		return knife;
	}

	abstract Knife createKnife(String type);
}
