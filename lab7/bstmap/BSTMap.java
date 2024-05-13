package bstmap;

import java.util.Iterator;
import java.util.Set;

/* 
 * implement all of the methods given in Map61B except for remove, iterator and keySet. 
 * For these methods you should throw an UnsupportedOperationException.
 * e.g. throw new RuntimeException("For no reason.");
 * 
 * Your BSTMap should also add an additional method printInOrder()
 */
public class BSTMap<K extends Comparable<K>, V> implements Map61B<K, V> {
    /* DONE */
    public class BSTNode<K extends Comparable<K>, V> {
        public K key;
        public V val;
        public BSTNode lchild;
        public BSTNode rchild;

        BSTNode(K k, V v) {
            key = k;
            val = v;
            lchild = null;
            rchild = null;
        }

        public BSTNode get(K key) {
            if (key == null) {
                return null;
            }
            int compare_num = this.key.compareTo(key);
            if (compare_num == 0) {
                return this;
            } else if (compare_num > 0) {
                if (lchild == null) {
                    return null;
                }
                return lchild.get(key);
            } else {
                if (rchild == null) {
                    return null;
                }
                return rchild.get(key);
            }
        }
    }

    /* TODO */
    public class BSTMapIter implements Iterator<K> {
        private BSTNode cur;
        public BSTMapIter() {
            cur = root;
        }

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public K next() {
            K ret = (K)cur.key;
            // cur = cur.next;
            return ret;
        }
    }

    /* DONE */
    private int size;
    private BSTNode root;

    /* DONE */
    BSTMap() {
        size = 0;
        root = null;
    }
    
    /* TODO */
    @Override
    public Iterator<K> iterator() {
        return new BSTMapIter();
    }

    /* DONE */
    @Override
    public void clear() {
        size = 0;
        root = null;
    }

    /* DONE */
    @Override
    public boolean containsKey(K key) {
        if (root == null) {
            return false;
        }
        BSTNode lookup = root.get(key);
        if(lookup == null) {
            return false;
        }
        return true;
    }

    /* DONE */
    @Override
    public V get(K key) {
        if (root == null) {
            return null;
        }
        BSTNode lookup = root.get(key);
        if(lookup == null) {
            return null;
        }
        return (V) lookup.val;
    }

    /* DONE */
    @Override
    public int size() {
        return size;
    }

    /* DONE */
    @Override
    public void put(K key, V value) {
        if (root == null) {
            root = new BSTNode(key, value);
        } else if (containsKey(key)) {
            BSTNode lookup = root.get(key);
            lookup.val = value;
        } else {
            put_helper(key, value, root);
        }
        size++;
    }

    private void put_helper(K key, V value, BSTNode bstnode) {
        int cmp = bstnode.key.compareTo(key);
        if(cmp < 0) {
            if (bstnode.rchild == null) {
                bstnode.rchild = new BSTNode(key, value);
                return;
            }
            put_helper(key, value, bstnode.rchild);
        } else {
            if (bstnode.lchild == null) {
                bstnode.lchild = new BSTNode(key, value);
                return;
            }
            put_helper(key, value, bstnode.lchild);
        }
    }

    /* DONE */
    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    /* DONE */
    @Override
    public V remove(K key) {
        throw new UnsupportedOperationException();
    }

    /* DONE */
    @Override
    public V remove(K key, V value) {
        throw new UnsupportedOperationException();
    }

    /* TODO */
    public void printInOrder() {
        return;
    }

    public static void main(String[] args) {
        return;
    }
}