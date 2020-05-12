/*
 * All rights reserved by Arafat Hossain Ar
 * App Name: Music Player
 * Author: Arafat Hossain
 * Version: 1.0
 * Creation Date: 10-05-2020
 */
package musicplayer;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Arafat Hossain Ar
 */
public class MusicPlayer extends javax.swing.JFrame {

    /**
     * Creates new form Mp3Player
     */
    //Model for playlist
    DefaultListModel model = new DefaultListModel();
    // Mouse Position
    int xMouse;
    int yMouse;
    //Creating custon inage icon
    ImageIcon ii;
    // Window collapsed
    boolean windowCollapsed = false;
    // Title after window collapsed
    String appName = "Music Player";
    // Define MP3Player Class From JACO MP3Player Lib
    MP3Player player;
    // Define File For Song
    File songFile;
    // Define Current Directory Like If We Use JFileChooser then where it statys.
    String currentDirectory = "home.user"; // I am using home.user this will call file chooser in user documents.
    // Define play pause button
    boolean playpause = false;
    String currentPath;
    // This String Will Be For Image Name or Path
    String imagePath;

    public MusicPlayer() {
        initComponents();

        songFile = new File("Select Music");
        // Now make a string to get file name
        String fileName = songFile.getName();
        // Here set our song name label with this name
        playing.setText(fileName);
        // Add our method to player variable
        player = mp3Player();
        // Now add song to player as playlist.
        player.addToPlayList(songFile);
        // Here get current path and images path in strings
        currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        System.out.println("pat" + currentPath);
        imagePath = "\\musicplayer\\image";
        System.out.println(currentPath + imagePath);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        labelPanel = new javax.swing.JPanel();
        playerTitle = new javax.swing.JLabel();
        titleicon = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        listPanel = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        playPanel = new javax.swing.JPanel();
        playing = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        play = new javax.swing.JLabel();
        playlist = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        soundup = new javax.swing.JLabel();
        sounddwon = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();
        fill = new javax.swing.JPanel();
        b = new javax.swing.JProgressBar();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Music Player");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(7, 63, 86));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPanel.setBackground(new java.awt.Color(0, 51, 51));
        labelPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                labelPanelMouseDragged(evt);
            }
        });
        labelPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelPanelMousePressed(evt);
            }
        });

        playerTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        playerTitle.setForeground(new java.awt.Color(102, 255, 204));
        playerTitle.setText("Music Player");

        titleicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/image/titleicon.png"))); // NOI18N

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/image/exiticon.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        about.setBackground(new java.awt.Color(0, 0, 0));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/image/abouticon.png"))); // NOI18N
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout labelPanelLayout = new javax.swing.GroupLayout(labelPanel);
        labelPanel.setLayout(labelPanelLayout);
        labelPanelLayout.setHorizontalGroup(
            labelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleicon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addContainerGap())
        );
        labelPanelLayout.setVerticalGroup(
            labelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(labelPanelLayout.createSequentialGroup()
                .addComponent(playerTitle)
                .addContainerGap(8, Short.MAX_VALUE))
            .addComponent(about, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(labelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

        listPanel.setBackground(new java.awt.Color(0, 102, 102));

        list.setBackground(new java.awt.Color(0, 102, 102));
        list.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        list.setForeground(new java.awt.Color(255, 255, 255));
        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        scrollPanel.setViewportView(list);

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(listPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 390, 250));

        playPanel.setBackground(new java.awt.Color(0, 153, 153));

        playing.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        playing.setForeground(new java.awt.Color(255, 255, 255));
        playing.setText("Playing");

        javax.swing.GroupLayout playPanelLayout = new javax.swing.GroupLayout(playPanel);
        playPanel.setLayout(playPanelLayout);
        playPanelLayout.setHorizontalGroup(
            playPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playing, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        playPanelLayout.setVerticalGroup(
            playPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playing, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        mainPanel.add(playPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 390, 30));

        controlPanel.setBackground(new java.awt.Color(0, 102, 102));

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/image/playicon.png"))); // NOI18N
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
        });

        playlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/image/playlisticon.png"))); // NOI18N
        playlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playlistMouseClicked(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/image/forewordicon.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/image/backwordicon.png"))); // NOI18N
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousMouseClicked(evt);
            }
        });

        soundup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/image/soundupicon.png"))); // NOI18N
        soundup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soundupMouseClicked(evt);
            }
        });

        sounddwon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/image/sounddownicon.png"))); // NOI18N
        sounddwon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sounddwonMouseClicked(evt);
            }
        });

        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/image/settingicon.png"))); // NOI18N

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sounddwon)
                .addGap(18, 18, 18)
                .addComponent(previous)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(play)
                .addGap(18, 18, 18)
                .addComponent(next)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(soundup)
                .addGap(14, 14, 14)
                .addComponent(playlist)
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addComponent(play)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(setting)
                    .addComponent(sounddwon)
                    .addComponent(soundup)
                    .addComponent(next)
                    .addComponent(playlist)
                    .addComponent(previous))
                .addContainerGap())
        );

        mainPanel.add(controlPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 390, -1));

        fill.setBackground(new java.awt.Color(0, 102, 102));

        b.setBackground(new java.awt.Color(0, 0, 0));
        b.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fillLayout = new javax.swing.GroupLayout(fill);
        fill.setLayout(fillLayout);
        fillLayout.setHorizontalGroup(
            fillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        fillLayout.setVerticalGroup(
            fillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        mainPanel.add(fill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 390, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPanelMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_labelPanelMousePressed

    private void labelPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPanelMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_labelPanelMouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "About");
    }//GEN-LAST:event_aboutMouseClicked

    private void playlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistMouseClicked
        // TODO add your handling code here:
        JFileChooser openFileChooser = new JFileChooser();
        JFrame jf = new JFrame();
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3", "Select MP3 Files Only!"));
        int agree = openFileChooser.showOpenDialog(jf.add(openFileChooser));
        int position = -1 + list.getModel().getSize();
        if (agree == JFileChooser.APPROVE_OPTION) {
            songFile = openFileChooser.getSelectedFile();
            player.addToPlayList(songFile);
            player.skipForward();
            currentDirectory = songFile.getAbsolutePath();
            playing.setText("" + songFile.getName());
            play.setIcon(getImageIcon(new File("src\\musicplayer\\image\\pauseicon.png")));
            String text = songFile.getName().toString();
            String[] txt;
            txt = new String[]{text};
            model.add(position, text);
            list.setModel(model);

        }


    }//GEN-LAST:event_playlistMouseClicked

    private void sounddwonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sounddwonMouseClicked
        // TODO add your handling code here:
        volumeDownControl(0.1);
    }//GEN-LAST:event_sounddwonMouseClicked

    private void soundupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soundupMouseClicked
        // TODO add your handling code here:
        volumeUpControl(0.1);
    }//GEN-LAST:event_soundupMouseClicked

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        // TODO add your handling code here:

        try {
            if (playpause == false) {
                playpause = true;
                player.play();
                play.setIcon(getImageIcon(new File("src\\musicplayer\\image\\pauseicon.png")));

            } else if (playpause == true) {
                playpause = false;
                player.pause();
                play.setIcon(getImageIcon(new File("src\\musicplayer\\image\\playicon.png")));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Select Music First!");
        }
    }//GEN-LAST:event_playMouseClicked

    private void labelPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPanelMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2) {
            if (windowCollapsed == false) {
                windowCollapsed = true;
                this.setSize(new Dimension(this.getSize().width, 40));

                playerTitle.setFont(new Font("Dialog", 0, 14));
                playerTitle.setText("" + songFile.getName());
            } else if (windowCollapsed == true) {
                windowCollapsed = false;
                this.setSize(new Dimension(this.getSize().width, 406));

                playerTitle.setFont(new Font("Dialog UI", 0, 24));
                playerTitle.setText(appName);
            }
        }
    }//GEN-LAST:event_labelPanelMouseClicked

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listValueChanged
        // TODO add your handling code here:
        list.getSelectedValue();
        player.play();

    }//GEN-LAST:event_listValueChanged

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        // TODO add your handling code here:
        try {
            player.skipForward();
            playing.setText("" + songFile.getName().toString());
            throw new Exception("dd");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Select Music First!");
        }
    }//GEN-LAST:event_nextMouseClicked

    private void previousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseClicked
        // TODO add your handling code here:
        try {
            player.skipBackward();
            playing.setText("" + songFile.getName().toString());
            throw new Exception("dd");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Select Music First!");
        }
    }//GEN-LAST:event_previousMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicPlayer().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private static javax.swing.JProgressBar b;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel fill;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel labelPanel;
    private javax.swing.JList<String> list;
    private javax.swing.JPanel listPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel next;
    private javax.swing.JLabel play;
    private javax.swing.JPanel playPanel;
    private javax.swing.JLabel playerTitle;
    private javax.swing.JLabel playing;
    private javax.swing.JLabel playlist;
    private javax.swing.JLabel previous;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel setting;
    private javax.swing.JLabel sounddwon;
    private javax.swing.JLabel soundup;
    private javax.swing.JLabel titleicon;
    // End of variables declaration//GEN-END:variables

    // I am going to create a custom MP3Player Method
    private MP3Player mp3Player() {
        MP3Player mp3Player = new MP3Player();
        return mp3Player;
    }

    // Let's Set Volume Down Method It's not necessary to remeber this code.
    private void volumeDownControl(Double valueToPlusMinus) {
        // Get Mixer Information From AudioSystem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        // Now use a for loop to list all mixers
        for (Mixer.Info mixerInfo : mixers) {
            // Get Mixer
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            // Now Get Target Line
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            // Here again use for loop to list lines
            for (Line.Info lineInfo : lineInfos) {
                // Make a null line
                Line line = null;
                // Make a boolean as opened
                boolean opened = true;
                // Now use try exception for opening a line
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    // Now Check If Line Is not Opened
                    if (!opened) {
                        // Open Line
                        line.open();
                    }
                    // Make a float control
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    // Get Current Volume Now
                    float currentVolume = volControl.getValue();
                    // Make a temp double variable and store valuePlusMinus
                    Double volumeToCut = valueToPlusMinus;
                    // Make a float and calculate the addition or subtraction in volume
                    float changedCalc = (float) ((float) currentVolume - (double) volumeToCut);
                    // Now Set This Changed Value Into Volume Line.
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {
                    // Close Line If it opened
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }

    // Let's Set Volume Up Method It's not necessary to remeber this code.
    private void volumeUpControl(Double valueToPlusMinus) {
        // Get Mixer Information From AudioSystem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        // Now use a for loop to list all mixers
        for (Mixer.Info mixerInfo : mixers) {
            // Get Mixer
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            // Now Get Target Line
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            // Here again use for loop to list lines
            for (Line.Info lineInfo : lineInfos) {
                // Make a null line
                Line line = null;
                // Make a boolean as opened
                boolean opened = true;
                // Now use try exception for opening a line
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    // Now Check If Line Is not Opened
                    if (!opened) {
                        // Open Line
                        line.open();
                    }
                    // Make a float control
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    // Get Current Volume Now
                    float currentVolume = volControl.getValue();
                    // Make a temp double variable and store valuePlusMinus
                    Double volumeToCut = valueToPlusMinus;
                    // Make a float and calculate the addition or subtraction in volume
                    float changedCalc = (float) ((float) currentVolume + (double) volumeToCut);
                    // Now Set This Changed Value Into Volume Line.
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {
                    // Close Line If it opened
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }

    // Let's Set Volume Method It's not necessary to remeber this code.
    private void volumeControl(Double valueToPlusMinus) {
        // Get Mixer Information From AudioSystem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        // Now use a for loop to list all mixers
        for (Mixer.Info mixerInfo : mixers) {
            // Get Mixer
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            // Now Get Target Line
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            // Here again use for loop to list lines
            for (Line.Info lineInfo : lineInfos) {
                // Make a null line
                Line line = null;
                // Make a boolean as opened
                boolean opened = true;
                // Now use try exception for opening a line
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    // Now Check If Line Is not Opened
                    if (!opened) {
                        // Open Line
                        line.open();
                    }
                    // Make a float control
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    // Get Current Volume Now
                    float currentVolume = volControl.getValue();
                    // Make a temp double variable and store valuePlusMinus
                    Double volumeToCut = valueToPlusMinus;
                    // Make a float and calculate the addition or subtraction in volume
                    float changedCalc = (float) ((double) volumeToCut);
                    // Now Set This Changed Value Into Volume Line.
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException | IllegalArgumentException lineException) {
                } finally {
                    // Close Line If it opened
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }
// Method for custom image icon

    public ImageIcon getImageIcon(File f) {

        try {
            Image im = ImageIO.read(f);

            ii = new ImageIcon(im);

        } catch (IOException i) {

            i.printStackTrace();

        } finally {

            return ii;

        }
    }

    //progress bar
}

class MyException extends Exception {

    public MyException() {

    }
}
