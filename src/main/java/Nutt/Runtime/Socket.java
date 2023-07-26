package Nutt.Runtime;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class Socket
{
	private java.net.Socket socket;
	private ServerSocket serverSocket;

	public Socket()
	{
		socket=new java.net.Socket();
	}

	public Socket(String address,int port) throws IOException
	{
		socket=new java.net.Socket(address,port);
	}

	public void bind(String address,int port) throws IOException
	{
		InetAddress inetAddress=InetAddress.getByName(address);
		serverSocket=new ServerSocket(port,0,inetAddress);
	}

	public void listen(int backlog) throws IOException
	{
		serverSocket.setSoTimeout(1000);
	}

	public Socket accept() throws IOException
	{
		java.net.Socket clientSocket=serverSocket.accept();
		Socket newSocket=new Socket();
		newSocket.socket=clientSocket;
		return newSocket;
	}

	public void connect(String address,int port) throws IOException
	{
		socket.connect(new InetSocketAddress(address,port));
	}

	public int send(byte[] data) throws IOException
	{
		OutputStream outputStream=socket.getOutputStream();
		outputStream.write(data);
		outputStream.flush();
		return data.length;
	}

	public byte[] recv(int buffer_size) throws IOException
	{
		InputStream inputStream=socket.getInputStream();
		byte[] buffer=new byte[buffer_size];
		int bytesRead=inputStream.read(buffer);
		byte[] data=new byte[bytesRead];
		System.arraycopy(buffer,0,data,0,bytesRead);
		return data;
	}

	public void close() throws IOException
	{
		socket.close();
		if(serverSocket!=null)
			serverSocket.close();
	}
}