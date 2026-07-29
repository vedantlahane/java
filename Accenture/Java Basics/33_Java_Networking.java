/*
===============================================================================
                           JAVA NETWORKING
===============================================================================

Author : Vedant
Module : Professional Java

===============================================================================
WHY DO WE NEED NETWORKING?
===============================================================================

Modern applications rarely work alone.

Applications communicate with

✔ Databases

✔ APIs

✔ Mobile Apps

✔ Browsers

✔ Cloud Services

✔ Other Microservices

Networking enables communication
between computers.

===============================================================================
WHAT IS A COMPUTER NETWORK?
===============================================================================

A Network is a group of devices
connected together
to exchange information.

Examples

Internet

Office LAN

Wi-Fi

Cloud Networks

===============================================================================
NETWORK TYPES
===============================================================================

PAN

Personal Area Network

----------------------------------------

LAN

Local Area Network

----------------------------------------

MAN

Metropolitan Area Network

----------------------------------------

WAN

Wide Area Network

Internet

===============================================================================
CLIENT SERVER MODEL
===============================================================================

Client

↓

Request

↓

Server

↓

Response

Examples

Browser

↓

Google Server

Mobile App

↓

REST API

Spring Boot App

↓

Database

===============================================================================
IP ADDRESS
===============================================================================

Unique address
assigned to every device.

Example

IPv4

192.168.1.10

IPv6

2001:db8::1

===============================================================================
PORT
===============================================================================

Port identifies
a specific application
running on a machine.

Examples

80

HTTP

----------------------------------------

443

HTTPS

----------------------------------------

3306

MySQL

----------------------------------------

5432

PostgreSQL

----------------------------------------

8080

Spring Boot

===============================================================================
SOCKET
===============================================================================

Socket =

IP Address

+

Port Number

Represents an endpoint
for communication.

===============================================================================
TCP
===============================================================================

Transmission Control Protocol

Characteristics

✔ Reliable

✔ Connection Oriented

✔ Ordered Delivery

✔ Error Checking

Examples

HTTP

HTTPS

SSH

FTP

SMTP

===============================================================================
UDP
===============================================================================

User Datagram Protocol

Characteristics

✔ Fast

✔ Connectionless

✔ No Delivery Guarantee

✔ Low Overhead

Examples

Video Streaming

Gaming

DNS

VoIP

===============================================================================
TCP vs UDP
===============================================================================

TCP

Reliable

Ordered

Slower

----------------------------------------

UDP

Fast

No guarantee

Unordered

===============================================================================
JAVA NETWORKING PACKAGE
===============================================================================

java.net

Contains

Socket

ServerSocket

DatagramSocket

URL

URI

InetAddress

HttpURLConnection

===============================================================================
INETADDRESS
===============================================================================

Represents an IP address.

Example

InetAddress.getLocalHost();

Methods

getHostName()

getHostAddress()

===============================================================================
SOCKET
===============================================================================

Client-side communication.

Example

Socket socket =

new Socket("localhost",8080);

Used with

InputStream

OutputStream

===============================================================================
SERVERSOCKET
===============================================================================

Server-side communication.

Example

ServerSocket server =

new ServerSocket(8080);

Socket client =

server.accept();

accept()

waits until a client connects.

===============================================================================
SOCKET COMMUNICATION
===============================================================================

Client

↓

Socket

↓

Network

↓

ServerSocket

↓

Server

===============================================================================
INPUT OUTPUT STREAMS
===============================================================================

Socket provides

InputStream

OutputStream

Used to

Read

Write

Network Data

===============================================================================
DATAGRAMSOCKET
===============================================================================

Used for

UDP Communication.

Example

DatagramSocket socket =
new DatagramSocket();

===============================================================================
DATAGRAMPACKET
===============================================================================

Represents

UDP Packet.

Contains

Data

Destination Address

Destination Port

===============================================================================
URL
===============================================================================

Uniform Resource Locator

Example

https://example.com/products

Parts

Protocol

Host

Port

Path

Query

===============================================================================
URI
===============================================================================

Uniform Resource Identifier

More general than URL.

Every URL

is a URI.

Not every URI

is a URL.

===============================================================================
HTTP
===============================================================================

HyperText Transfer Protocol

Request

↓

Response

Stateless Protocol.

===============================================================================
HTTP METHODS
===============================================================================

GET

Read

----------------------------------------

POST

Create

----------------------------------------

PUT

Update

----------------------------------------

PATCH

Partial Update

----------------------------------------

DELETE

Delete

===============================================================================
HTTP STATUS CODES
===============================================================================

200

OK

----------------------------------------

201

Created

----------------------------------------

400

Bad Request

----------------------------------------

401

Unauthorized

----------------------------------------

403

Forbidden

----------------------------------------

404

Not Found

----------------------------------------

500

Internal Server Error

===============================================================================
HTTPURLCONNECTION
===============================================================================

Legacy HTTP API.

Example

URL url = new URL(...);

HttpURLConnection connection =

(HttpURLConnection)

url.openConnection();

===============================================================================
JAVA HTTP CLIENT
===============================================================================

Introduced

Java 11

Package

java.net.http

Classes

HttpClient

HttpRequest

HttpResponse

Preferred API today.

===============================================================================
HTTP CLIENT FLOW
===============================================================================

HttpClient

↓

HttpRequest

↓

send()

↓

HttpResponse

===============================================================================
HTTPS
===============================================================================

HTTP

+

SSL/TLS Encryption

Default Port

443

Secure communication.

===============================================================================
COOKIES
===============================================================================

Small data stored
by browser.

Used for

Sessions

Authentication

Preferences

===============================================================================
SESSIONS
===============================================================================

Server-side user state.

Client stores

Session ID

Server stores

Session Data

===============================================================================
REST API
===============================================================================

Representational State Transfer

Client

↓

HTTP Request

↓

Server

↓

JSON Response

Spring Boot heavily uses REST.

===============================================================================
JSON
===============================================================================

JavaScript Object Notation

Most common
API response format.

Example

{

"id":1,

"name":"Vedant"

}

===============================================================================
WEBSOCKETS
===============================================================================

Persistent

Bidirectional Communication.

Examples

Chat

Stock Market

Gaming

Notifications

===============================================================================
DNS
===============================================================================

Domain Name System

Converts

google.com

↓

IP Address

===============================================================================
SSL TLS
===============================================================================

Provides

Encryption

Authentication

Integrity

HTTPS depends on TLS.

===============================================================================
COMMON EXCEPTIONS
===============================================================================

UnknownHostException

SocketException

ConnectException

SocketTimeoutException

IOException

===============================================================================
COMMON MISTAKES
===============================================================================

❌ Forgetting to close sockets.

----------------------------------------

❌ Ignoring timeouts.

----------------------------------------

❌ Using TCP for
real-time gaming.

----------------------------------------

❌ Hardcoding ports.

===============================================================================
BEST PRACTICES
===============================================================================

✔ Use try-with-resources.

✔ Configure connection timeout.

✔ Prefer Java 11 HttpClient.

✔ Validate server certificates.

✔ Use HTTPS.

✔ Handle retries.

===============================================================================
REAL WORLD EXAMPLES
===============================================================================

Spring Boot REST APIs

↓

HTTP

----------------------------------------

WhatsApp

↓

WebSockets

----------------------------------------

Netflix

↓

HTTPS

----------------------------------------

Online Games

↓

UDP

----------------------------------------

Cloud Services

↓

REST APIs

===============================================================================
INTERVIEW QUESTIONS
===============================================================================

Q1 Difference between TCP and UDP?

TCP

Reliable

UDP

Fast

--------------------------------------------------------

Q2 What is a Socket?

Combination of
IP Address and Port.

--------------------------------------------------------

Q3 Difference between
Socket and ServerSocket?

Socket

Client

ServerSocket

Server

--------------------------------------------------------

Q4 Difference between URL and URI?

URL locates resource.

URI identifies resource.

--------------------------------------------------------

Q5 Which Java package
contains networking classes?

java.net

--------------------------------------------------------

Q6 Difference between
HttpURLConnection
and HttpClient?

HttpURLConnection

Legacy

HttpClient

Modern Java 11 API

--------------------------------------------------------

Q7 Which protocol
uses port 443?

HTTPS

--------------------------------------------------------

Q8 What is DNS?

Maps domain names
to IP addresses.

--------------------------------------------------------

Q9 What are WebSockets?

Persistent
two-way communication.

--------------------------------------------------------

Q10 Which protocol
is preferred for REST APIs?

HTTP / HTTPS

===============================================================================
PRACTICE PROGRAMS
===============================================================================

1. Print local IP address.

2. Resolve hostname.

3. TCP Client.

4. TCP Server.

5. UDP Sender.

6. UDP Receiver.

7. Download webpage using HttpClient.

8. REST API GET request.

9. File transfer using sockets.

10. Simple Chat Application.

===============================================================================
QUICK REVISION
===============================================================================

✔ Network connects devices

✔ Socket = IP + Port

✔ TCP = Reliable

✔ UDP = Fast

✔ java.net package

✔ Socket = Client

✔ ServerSocket = Server

✔ HttpClient = Modern HTTP API

✔ REST uses HTTP

✔ WebSockets = Persistent Communication

===============================================================================
NEXT TOPIC
===============================================================================

34_Maven_Gradle.java

Topics

• What is Maven?

• What is Gradle?

• Project Structure

• pom.xml

• build.gradle

• Dependency Management

• Maven Lifecycle

• Plugins

• Multi-module Projects

• Interview Questions

===============================================================================
*/