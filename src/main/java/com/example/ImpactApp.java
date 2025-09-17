package com.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "impact-cli", description = "Prints company name", mixinStandardHelpOptions = true)
public class ImpactApp implements Runnable {
    public void run() {
        System.out.println("impact.com");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ImpactApp()).execute(args);
        System.exit(exitCode);
    }
}
