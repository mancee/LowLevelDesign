package FileSystem;

public class FileSystemClient {
	
	public static void main(String[] args) {
		
		FileSystemManager manager = new FileSystemManager();
		
		manager.createPath("/mansi/personal/certificates/certificate.pdf");
		manager.getFileContent("/mansi/personal/certificates/certificate.pdf");
		String content = manager.getFileContent("/mansi/personal/certificates/certificate.pdf");
		System.out.println(content);
		manager.setFileContent("/mansi/personal/certificates/certificate.pdf","Rockstarrrrrrrrrr!!!1");
		content = manager.getFileContent("/mansi/personal/certificates/certificate.pdf");
		System.out.println(content);
		
		manager.createPath("/mansi/personal/awards/award1.txt");
		
		manager.display();
		FileSystemNode file = manager.getNode("/mansi/personal/awards/award1.txt");
		System.out.println(file.getName());
		
		System.out.println(manager.getParentPath("/mansi/personal/awards/award1.txt"));
		System.out.println(manager.ifFileExists("/mansi/personal/awards/award2.txt"));
		
		manager.createPath("/mansi/personal/certificates/certificate2.pdf");
		
		Directory dir = (Directory) manager.getNode("/mansi/personal/certificates");
		dir.display(0);
		
		manager.removePath("/mansi/personal/certificates/certificate2.pdf");
		manager.display();
	}
}
