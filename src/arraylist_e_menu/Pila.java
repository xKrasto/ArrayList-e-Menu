/*
 * The MIT License
 *
 * Copyright 2018 Alexandro / xKrasto.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package arraylist_e_menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alexandro / xKrasto
 */
public class Pila {

    private ArrayList elementi;

    public Pila() {
        elementi = new ArrayList();
    }

    public void push(Object obj) {
        elementi.add(obj);
    }

    public Object pop() {
        Object obj = null;
        int size = elementi.size();
        if (size > 0) {
            obj = elementi.get(size - 1);
            elementi.remove(size - 1);
        }
        return obj;
    }

    public Object top() {
        Object obj = null;
        int size = elementi.size();
        if (size > 0) {
            obj = elementi.get(size - 1);
        }
        return obj;
    }

    public boolean vuota() {
        if (elementi.size() > 0) {
            return false;
        } else {
            return true;
        }
    }

    public int size() {
        return elementi.size();
    }
    
    public Iterator iterator(){
        return elementi.iterator();
    }
}
