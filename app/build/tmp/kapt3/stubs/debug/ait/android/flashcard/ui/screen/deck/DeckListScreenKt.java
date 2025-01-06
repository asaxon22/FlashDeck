package ait.android.flashcard.ui.screen.deck;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001aL\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a0\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0007\u001a\u001e\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a8\u0006\u0017"}, d2 = {"AddDeckDialog", "", "viewModel", "Lait/android/flashcard/ui/screen/deck/DeckListViewModel;", "deckToEdit", "Lait/android/flashcard/data/DeckItem;", "onCancel", "Lkotlin/Function0;", "DeckCard", "DeckItem", "onDeckClicked", "Lkotlin/Function1;", "onDeckEdit", "onDeckDelete", "DeckListScreen", "modifier", "Landroidx/compose/ui/Modifier;", "ErrorDialog", "DeckName", "", "Front", "Back", "GenAIDialog", "app_debug"})
public final class DeckListScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void DeckListScreen(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    ait.android.flashcard.ui.screen.deck.DeckListViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ait.android.flashcard.data.DeckItem, kotlin.Unit> onDeckClicked) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AddDeckDialog(@org.jetbrains.annotations.NotNull()
    ait.android.flashcard.ui.screen.deck.DeckListViewModel viewModel, @org.jetbrains.annotations.Nullable()
    ait.android.flashcard.data.DeckItem deckToEdit, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCancel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DeckCard(@org.jetbrains.annotations.NotNull()
    ait.android.flashcard.data.DeckItem DeckItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ait.android.flashcard.data.DeckItem, kotlin.Unit> onDeckClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ait.android.flashcard.data.DeckItem, kotlin.Unit> onDeckEdit, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ait.android.flashcard.data.DeckItem, kotlin.Unit> onDeckDelete) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ErrorDialog(@org.jetbrains.annotations.NotNull()
    ait.android.flashcard.ui.screen.deck.DeckListViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCancel, @org.jetbrains.annotations.NotNull()
    java.lang.String DeckName, @org.jetbrains.annotations.NotNull()
    java.lang.String Front, @org.jetbrains.annotations.NotNull()
    java.lang.String Back) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void GenAIDialog(@org.jetbrains.annotations.NotNull()
    ait.android.flashcard.ui.screen.deck.DeckListViewModel viewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onCancel) {
    }
}