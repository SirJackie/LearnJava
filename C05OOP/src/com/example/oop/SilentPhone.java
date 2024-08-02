package com.example.oop;

/*
 * 2. Inheritance
 * When you're creating several similar clases with similar properties and methods
 * (e.g. Dog; Bird; Cat), you're doing the thing wrong. (Copy and pasting.)
 * Instead, you should use inheritance to reuse one base class (e.g. Animal),
 * and only define the difference of your subclasses.
 */

public class SilentPhone extends Phone{
    public SilentPhone(String name, int camera, int memoryRam, int screenSize) {
        /*
         * super keyword: for child classes to reuse the behavior of the parent class.
         */
        super(name, camera, memoryRam, screenSize);
    }

    /*
     * 3. Polymorphism
     * 3.2. Overriding Polymorphism
     * Which means child class @Override the parent class's method.
     */

    @Override
    public void playMusic(String trackName) {
        super.playMusic(trackName);
        System.out.println("SILENT PHONE HINT: Playing through earphone. You cannot hear it outside.");
    }

    /*
     * 3. Polymorphism
     * 3.3. Functional Polymorphism
     * Which means having two different functions using the same name (with different parameters).
     * e.g.
     * public void playMusic(String trackName)
     * public void playMusic(String trackName, String URL)
     */

    public void playMusic(String trackName, String URL){
        System.out.println(
            this.getName() + " is playing: " + trackName + " through URL: " + URL
        );
    }

    /**
     * This kind of special comment is designed for functions (starts with /**)
     * It can be viewed conveniently. (Mouse Hover || Cursor Hover + Ctrl+Q)
     */

    public void boomBoom(){
        System.out.println("boomBoom! I don't know why this happened :)");
    }
}
