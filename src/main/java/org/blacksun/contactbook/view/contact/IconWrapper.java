package org.blacksun.contactbook.view.contact;

import org.blacksun.contactbook.model.Contact;

import javax.swing.*;
import java.awt.*;

public class IconWrapper implements ContactWrapper, Icon {
    private final Contact contact;
    private final int FONT_SIZE = 16;

    private class Incrementer {
        private int value;
        private final int step;

        Incrementer(int value, int step) {
            this.value = value;
            this.step = step;
        }

        int getNextValue() {
            value += step;
            return value;
        }
    }

    public IconWrapper(Contact contact) {
        this.contact = contact;
    }

    private void drawText(Graphics g, String text, int x, Incrementer y) {
        final char[] chars = text.toCharArray();
        g.drawChars(chars, 0, chars.length,
                x, y.getNextValue());
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Incrementer closure = new Incrementer(y, FONT_SIZE);
        drawText(g, contact.getName(), x, closure);
        contact.getPhoneNumbers().forEach(phone -> {
            drawText(g, phone, x + 16, closure);
        });
    }

    @Override
    public int getIconWidth() {
        return 100;
    }

    @Override
    public int getIconHeight() {
        return contact.getPhoneNumbers().size() * FONT_SIZE + FONT_SIZE;
    }
}
