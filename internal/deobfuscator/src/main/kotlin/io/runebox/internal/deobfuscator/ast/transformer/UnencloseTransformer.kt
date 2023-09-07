package io.runebox.internal.deobfuscator.ast.transformer

import com.github.javaparser.ast.expr.EnclosedExpr
import io.runebox.internal.deobfuscator.ast.AstTransformer
import io.runebox.internal.deobfuscator.ast.Module
import io.runebox.internal.deobfuscator.ast.util.walk
import org.tinylog.kotlin.Logger

class UnencloseTransformer : AstTransformer {

    private var count = 0

    override fun run(module: Module) {
        for(unit in module) {
            unit.walk { expr: EnclosedExpr ->
                expr.replace(expr.inner.clone()).also { if(it) count++ }
            }
        }

        Logger.info("Replaced $count enclosed expressions.")
    }
}