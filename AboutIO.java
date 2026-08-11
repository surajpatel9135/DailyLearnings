/*
STANDARD INPUT OUTPUT:- I/O stands for Input/Output, which represents the communication between a 
- computer program and the outside world (like a keyboard, screen, file, or network).
its types:-
1. console i/o
2. file i/o
3. network i/o
4. memory i/o

console i/o :- 
Data is exchanged directly between your program and the user's terminal or command line interface.
The Source/Destination: The keyboard for input, and the monitor screen for output.
How it works: It uses standard system streams. System.in captures what you type, and System. out prints text to the screen.
Common Use: Command-line tools, debugging scripts, and interactive terminal applications.

2. File i/o:
Data is read from or written to persistent storage devices, like a Solid State Drive (SSD) or Hard Disk Drive (HDD).
The Source/Destination: Physical or virtual files (e.g., .txt, .csv, .json, .png).
How it works: The operating system opens a file handle, logs the program's request, and reads/writes blocks of data to the drive. Unlike Console I/O, you must explicitly open and close files to avoid memory leaks.
Common Use: Saving user settings, loading game progress, reading databases, and exporting spreadsheets.

3. Network I/O:-
Data is transferred across a network connection between different computers or servers.
The Source/Destination: A network interface card (Wi-Fi or Ethernet) communicating via internet protocols (like HTTP, TCP/IP, or WebSockets).
How it works: Data is packaged into network packets. Your program pushes these packets into a network socket, which routes them across the internet to a remote machine.
Common Use: Fetching data from a web API, loading websites, playing online multiplayer games, and real-time chat applications.

4. Memory I/O:- 
Data is read and written entirely within the computer’s temporary random-access memory (RAM).
The Source/Destination: Byte arrays, buffers, or string structures inside RAM.
How it works: It acts exactly like File or Network I/O by using streams, but no hardware drive or network adapter is involved. It simulates an external source completely in memory for speed.
Common Use: Creating temporary caches, parsing data before saving it, and unit testing code without modifying actual files on a hard drive.
*/

// 1. Console i/o:- 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AboutIO {
    public static void main (String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        
        BufferedReader br = new BufferedReader(isr);
        
        String name = br.readLine();
        
        System.out.println(name);
    }
}

/*
SURAJ KUMAR PATEL ---> I/p
OS Buffer (83 85 82 65 74 32 75 85 77 65 82 32 80 65 84 69 76)
System.in (InputStream) recieves bytes
InputStreamReader ---> convert stream of bytes into stream of characters.
('S', 'U', 'R', 'A', 'J', 'K', 'U', 'M', 'A', 'R', 'P', 'A', 'T', 'E', 'L')
BufferedReader ---> readLine ---> SURAJ KUMAR PATEL ---> name
SURAJ KUMAR PATEL ---> O/P
*/ 