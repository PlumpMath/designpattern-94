package com.tobby.designpattern.proxy.virtual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageProxyTestDrive {

	ImageComponent imageComponent;
	JFrame frame = new JFrame("CD Cover Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> cds = new Hashtable<>();

	public static void main(String[] args) throws Exception {
		new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive() throws Exception {
		cds.put("Ambient: Music for Airports", "http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
		cds.put("Budda Bar", "http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
		cds.put("Ima", "http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
		cds.put("Karma", "http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.jpg");
		cds.put("MCMXC A.D", "http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
		cds.put("Northern Exposure", "http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
		cds.put("Selected Ambient Works, Vol. 2", "http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
		cds.put("Oliver", "http://www.cs.yale.edu/homes/freeman-elisabeth/2004/9/Oliver_sm.jpg");
		URL initialURL = new URL((String)cds.get("Selected Ambient Works, Vol. 2"));
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite CDs");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		for (Enumeration<String> e = cds.keys(); e.hasMoreElements();) {
			String name = e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem);
			menuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
					frame.repaint();
				}
			});
		}
		
		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
	
	URL getCDUrl(String name) {
		try {
			return new URL(cds.get(name));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
