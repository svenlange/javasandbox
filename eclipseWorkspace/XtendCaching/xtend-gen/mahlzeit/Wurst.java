package mahlzeit;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Wurst {
  public String blah(final String input) {
    final ArrayList<?>_cacheKey = CollectionLiterals.newArrayList(input);
    final String _result;
    synchronized (_createCache_blah) {
      if (_createCache_blah.containsKey(_cacheKey)) {
        return _createCache_blah.get(_cacheKey);
      }
      String _string = new String();
      _result = _string;
      _createCache_blah.put(_cacheKey, _result);
    }
    _init_blah(_result, input);
    return _result;
  }
  
  private final HashMap<ArrayList<? extends Object>,String> _createCache_blah = CollectionLiterals.newHashMap();
  
  private void _init_blah(final String target, final String input) {
  }
}
