package ait.android.flashcard.ui.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lait/android/flashcard/ui/navigation/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "CardBrowser", "DeckList", "Lait/android/flashcard/ui/navigation/Screen$CardBrowser;", "Lait/android/flashcard/ui/navigation/Screen$DeckList;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lait/android/flashcard/ui/navigation/Screen$CardBrowser;", "Lait/android/flashcard/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class CardBrowser extends ait.android.flashcard.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final ait.android.flashcard.ui.navigation.Screen.CardBrowser INSTANCE = null;
        
        private CardBrowser() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lait/android/flashcard/ui/navigation/Screen$DeckList;", "Lait/android/flashcard/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class DeckList extends ait.android.flashcard.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final ait.android.flashcard.ui.navigation.Screen.DeckList INSTANCE = null;
        
        private DeckList() {
        }
    }
}