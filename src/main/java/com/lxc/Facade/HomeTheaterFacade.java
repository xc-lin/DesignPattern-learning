package com.lxc.Facade;

/**
 * @author Frank_lin
 * @date 2022/7/16
 */
public class HomeTheaterFacade {
    private Light light;
    private PopCorn popCorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.light = Light.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }


    public void ready(){
        light.on();
        popCorn.on();
        stereo.on();
        screen.down();
        dvdPlayer.on();
        light.dim();
    }


    public void play(){
        dvdPlayer.play();
    }
    public void pause(){
        dvdPlayer.pause();
    }


    public void end(){
        popCorn.off();
        light.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }


}
