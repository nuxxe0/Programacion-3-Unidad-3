import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicaLaberinto {

	private int musica;
	
	public MusicaLaberinto () {
		music("musica.wav"); 
		
	}
	
	public void music(String archivo) //insertar audio :p
	{
		try 
		{
			File sound = new File(archivo);
			if(!sound.exists())
			{
				System.out.println("error, no existe");
				return;
			}
			
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al reproducir");
		}
	}
}
