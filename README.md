# Bookstore Inventory (Java)

A small Java command-line exercise that reads a sample book inventory from `books.txt`, prints each book, and calculates the total inventory value. It uses only the Java standard library.

## Run

From the repository directory:

```bash
javac Book.java BookstoreApp.java
java BookstoreApp
```

Keep `books.txt` in the working directory when running the program. Each line contains five comma-separated fields:

```text
title,author,publisher,year,price
```

The repository includes three sample entries. The program displays each book and the sum of its prices.

## Files

- `Book.java` defines the book data and its display format.
- `BookstoreApp.java` reads the file and prints the inventory and total.
- `books.txt` contains sample data.

## Current limitations

This is a learning exercise, not a full bookstore system. It does not manage sales or persist changes. The parser assumes every line has exactly five fields with no commas inside a field, and malformed numbers are not handled separately.
