package day18.socket2;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {

	public static void main(String[] args) {
		int port =5001;
		//String ip = "192.168.30.192";
		try(ServerSocket serverSocket = new ServerSocket(port))  //
		{	while(true) { //while문을 쓰면 유저 여려명 사용 가능
			Socket socket = serverSocket.accept();
			Client client = new Client(socket); //유저 1명
			client.send();
			client.receive();
		}
		}catch (Exception e)
		{ 	System.out.println("서버 소켓 생성에서 예외가 발생하여 종료됩니다.");
		}		
		
	}

}
