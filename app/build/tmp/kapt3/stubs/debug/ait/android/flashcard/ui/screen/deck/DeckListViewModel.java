package ait.android.flashcard.ui.screen.deck;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ*\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\u0017J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001a0\u0019J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lait/android/flashcard/ui/screen/deck/DeckListViewModel;", "Landroidx/lifecycle/ViewModel;", "DecksDAO", "Lait/android/flashcard/data/DecksDAO;", "(Lait/android/flashcard/data/DecksDAO;)V", "getDecksDAO", "()Lait/android/flashcard/data/DecksDAO;", "_textGenerationResult", "Landroidx/compose/runtime/MutableState;", "", "generativeModel", "Lcom/google/ai/client/generativeai/GenerativeModel;", "addDeck", "", "DeckItem", "Lait/android/flashcard/data/DeckItem;", "deleteAllDecks", "deleteDeck", "generateCards", "prompt", "numCards", "", "callback", "Lkotlin/Function1;", "getAllDecks", "Lkotlinx/coroutines/flow/Flow;", "", "updateDeck", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DeckListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final ait.android.flashcard.data.DecksDAO DecksDAO = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.ai.client.generativeai.GenerativeModel generativeModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.String> _textGenerationResult = null;
    
    @javax.inject.Inject()
    public DeckListViewModel(@org.jetbrains.annotations.NotNull()
    ait.android.flashcard.data.DecksDAO DecksDAO) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ait.android.flashcard.data.DecksDAO getDecksDAO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<ait.android.flashcard.data.DeckItem>> getAllDecks() {
        return null;
    }
    
    public final void addDeck(@org.jetbrains.annotations.NotNull()
    ait.android.flashcard.data.DeckItem DeckItem) {
    }
    
    public final void deleteAllDecks() {
    }
    
    public final void deleteDeck(@org.jetbrains.annotations.NotNull()
    ait.android.flashcard.data.DeckItem DeckItem) {
    }
    
    public final void updateDeck(@org.jetbrains.annotations.NotNull()
    ait.android.flashcard.data.DeckItem DeckItem) {
    }
    
    public final void generateCards(@org.jetbrains.annotations.NotNull()
    java.lang.String prompt, int numCards, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
}