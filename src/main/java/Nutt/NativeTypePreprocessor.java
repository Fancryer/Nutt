package Nutt;

import java.io.IOException;

public class NativeTypePreprocessor
{
	public static void main(String[] args) throws IOException
	{
		//		// Создание окна
		//		JFrame frame=new JFrame();
		//		frame.setSize(32,32);
		//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		//		// Создание изображения и получение графики для рисования
		//		BufferedImage image=new BufferedImage(32,32,BufferedImage.TYPE_INT_RGB);
		//		Graphics2D g=image.createGraphics();
		//
		//		// Рисование пикселей
		//		g.setColor(Color.RED);
		//		g.fillRect(0,0,16,16);
		//
		//		g.setColor(Color.GREEN);
		//		g.fillRect(16,0,16,16);
		//
		//		g.setColor(Color.BLUE);
		//		g.fillRect(0,16,16,16);
		//
		//		g.setColor(Color.YELLOW);
		//		g.fillRect(16,16,16,16);
		//
		//		// Отображение изображения в окне
		//		frame.getContentPane().setLayout(new BorderLayout());
		//		frame.getContentPane().add(new JLabel(new ImageIcon(image)),BorderLayout.CENTER);
		//		frame.setVisible(true);
		//		var intSignature=new String[]{"intSignature","a:Int,b:Int","Int"};
		//		var intUnwrapper=new String[][]{{"l","left.getValueAs(Int.class).asBigInteger()"},
		//				{"r","right.getValueAs(Int.class).asBigInteger()"}};
		//		List<List<String>> operatorList=
		//				List.of
		//						    (
		//								    List.of
		//										        (
		//
		//												        "+",
		//												        "intSignature",
		//												        "intUnwrapper",
		//												        "Int",
		//												        "l.add(r)"
		//										        )
		//						    );
		//		var intTypeConstructor=MethodSpec.constructorBuilder()
		//		                                 .addModifiers(Modifier.PRIVATE)
		//		                                 .addStatement("super(NumerableType.getInstance(),\"Int\")");
		//		for(var signature: new String[][]{intSignature})
		//		{
		//			intTypeConstructor.addStatement("var "+signature[0]+"=new Signature($S,$S)",signature[1],signature[2]);
		//		}
		//		for(var operator: operatorList)
		//		{
		//			intTypeConstructor.addStatement
		//					                  (
		//							                  "addOperators(new Operator($S,intSignature(left,right)->new "
		//							                  +operator.get(3)
		//							                  +"("
		//							                  +intUnwrapper[0][1]
		//							                  + ")).toAnonymousReference())",
		//							                  operator.get(0)
		//					                  );
		//		}
		//		TypeSpec intType=TypeSpec
		//				.classBuilder("IntType")
		//				.addModifiers(Modifier.PUBLIC)
		//				.superclass(NativeType.class)
		//				.addField
		//						(
		//								FieldSpec.builder(ClassName.get("com.baeldung.javapoet.person","IntType"),"instance")
		//								         .addModifiers(Modifier.PRIVATE,Modifier.STATIC)
		//								         .build()
		//						)
		//				.addMethod(intTypeConstructor.build())
		//				.build();
		//		JavaFile javaFile=JavaFile
		//				.builder("com.baeldung.javapoet.person",intType)
		//				.indent("    ")
		//				.build();
		//
		//		javaFile.writeTo(System.out);
	}
}
